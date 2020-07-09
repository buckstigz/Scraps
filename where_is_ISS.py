#!/bin/python3

# this code requires being run in the projects.raspberrypi.org trinket setup with the
# proper turtle files already loaded!!!


import json
import turtle
import urllib.request
#from where import url
import time

#url = 'http://api.open-notify.org/astros.json'
#response = urllib.request.urlopen(url)
#result = json.loads(response.read())
#print('People in Space: ', result['number'])
#people = result['number']
#people = result['people']

#for p in people:
#  print(p['name'], 'in', p['craft'])

#print(result)
#location = result['iss_position']
#long = float(location['longitude'])
#lat = float(location['latitude'])

#print('Latitude: ', lat)
#print('Longitude: ', long)

screen = turtle.Screen()
screen.setup(720, 360)
screen.setworldcoordinates(-180, -90, 180, 90)
screen.bgpic('map.gif')

screen.register_shape('iss.gif')
iss = turtle.Turtle()
iss.shape('iss.gif')
iss.setheading(90)

#iss.penup()
#iss.goto(long, lat)

# Space Center, Houston
lat = 51.421110
long = -0.818640

location = turtle.Turtle()
location.penup()
location.color('yellow')
location.goto(long, lat)
location.dot(5)
location.hideturtle()

url = 'http://api.open-notify.org/iss-pass.json'
url = url + '?lat=' + str(lat) + '&lon=' + str(long)
response = urllib.request.urlopen(url)
result = json.loads(response.read())

over = result['response'][1]['risetime']
print(over)

style = ('Arial', 6, 'bold')
location.write(time.ctime(over), font=style)
