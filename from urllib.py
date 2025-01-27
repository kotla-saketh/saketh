# py1: Import necessary libraries and functions
from ke1 import key
import requests
from mice import mic1
import pyttsx3
import re

# py2: Import speech recognition library
import speech_recognition as sr

# py3: Define functions for temperature information
def temp_room(room):
    result = "Temp = 20, Humidity 70"
    return result

def temp_city(city):
    url = "https://yahoo-weather.p.rapidapi.com/weather"
    querystring = {"location": city, "format": "json", "u": "f"}
    headers = {
        "X-RapidAPI-Key": "c32615b66cmsh4f1642869fcc6cbp11ddc9jsn5a9290a4ba18",
        "X-RapidAPI-Host": "yahoo-weather5.p.rapidapi.com"
    }
    response = requests.get(url, headers=headers, params=querystring)
    d1 = response.json()

    current_observation = d1.get("current_observation")
    if current_observation:
        atmosphere = current_observation.get('atmosphere')
        if atmosphere:
            hum = atmosphere.get('humidity')
            temp = current_observation.get('condition').get("temperature")
            temp = round((temp - 32) * 5 / 9, 2)
            return f"Humidity: {hum}, Temp in C: {temp}"
        else:
            return "Failed to extract atmosphere information from the response."
    else:
        return "Failed to extract current observation information from the response."

# py4: Define functions for IP address and function call handling
import socket

def get_ip(host):
    try:
        result = socket.getaddrinfo(host, None)
        return result
    except Exception as e:
        return f"Error in finding the IP: {e}"

definitions = [
    {
        "name": "get_ip",
        "description": "Find the IP address of a given URL or domain name",
        "parameters": {
            "host": {
                "type": "string",
                "description": "URL or domain name"
            }
        }
    },
    {
        "name": "temp_city",
        "description": "Find weather and temperature of a city",
        "parameters": {
            "city": {
                "type": "string",
                "description": "City to find weather"
            }
        }
    },
    {
        "name": "temp_room",
        "description": "Find temperature of a room or home",
        "parameters": {
            "room": {
                "type": "string",
                "description": "Room or home"
            }
        }
    }
]

# py5: Define the Jarvis AI main functions
def generate_chat(chat):
    messages = [{"role": "user", "parts": [{"text": f"You said: {chat}"}]}]
    data = {"contents": messages}
    url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + key

    try:
        response = requests.post(url, json=data)
        response.raise_for_status()
        result = response.json()
        return result.get("candidates")[0].get("content").get("parts")[0].get("text")

    except requests.exceptions.RequestException as e:
        print(f"Request to API failed: {e}")
        return None
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
        return None

def speak(text):
    text_without_special_chars = re.sub(r'[^a-zA-Z0-9\s]', '', text)
    engine = pyttsx3.init()
    engine.say(text_without_special_chars)
    engine.runAndWait()

def mic_input():
    recognizer = sr.Recognizer()  # Initialize the recognizer object here
    try:
        with sr.Microphone(device_index=0) as source:
            print("Say something: ")
            recognizer.adjust_for_ambient_noise(source)
            audio = recognizer.listen(source, timeout=5)
            print("Recognizing.... ")
            text = recognizer.recognize_google(audio)
            print("You said:", text)
            return text
    except sr.UnknownValueError:
        print("Sorry, could not understand audio.")
        return None
    except sr.RequestError as e:
        print(f"Recognition request failed: {e}")
        return None
    except Exception as e:
        print(f"An unexpected error occurred: {e}")
        return None

def call_function(func_name, arguments):
    print(f"Gemini: call function {func_name}")
    print(f"Gemini: arguments are {arguments}")
    function = None
    for definition in definitions:
        if definition["name"] == func_name:
            function = globals()[func_name]
            break

    if function:
        result = function(**arguments)
        print(f"{func_name} result: {result}")
        return result
    else:
        print(f"Error: Function {func_name} not found")
        return None

if __name__ == "__main__":
    chat_input = mic_input()
    if chat_input:
        response_text = generate_chat(chat_input)
        if response_text:
            print(f"AI Jarvis: {response_text}")
            speak(response_text)
        else:
            print("Sorry, couldn't generate a response.")
