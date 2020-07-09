# remember to import any widgets to use here
from guizero import App, Text, TextBox, PushButton, Slider, Picture

def say_my_name():
    """
    This function refers to the below text widget. It will set
    the value of welcome_message to what is typed into the 
    TextBox widget my_name
    """
    welcome_message.value = my_name.value

def change_text_size(slider_value):
    """
    This function will be called whenever the slider is moved
    which is why it takes the parameter slider_value. The
    following code uses the current slider value to set the 
    size of the welcome message
    """
    welcome_message.size = slider_value

# below is all widget code
app = App(title="Hello World")
welcome_message = Text(app, text="Welcome to my app", size=40, font="Times New Roman", color="lightgreen")
my_name = TextBox(app, width=150)
update_text = PushButton(app,  command=say_my_name, text="Display my name")
# command tells the button which function to call on when pressed
# text is the text that is displayed on the button 
# this button applies the function in the gui
text_size = Slider(app, command=change_text_size, start=10, end=80)
# the values start and end determine the largest and smallest
# values of the slider
my_cat = Picture(app, image="cat.gif")
# pictures can only be added if they are in gif format.

app.display() # Event Loop - all widget code above this.