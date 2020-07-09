from guizero import App, Combo, Text, CheckBox, ButtonGroup, PushButton, info

def do_booking():
    """
    implements the info box function from guizero to create a pop up from the og gui
    """
    info("Booking", "Thank you for booking")
    """
    now adding the print method so we can keep track of user options chosen 
    """
    print(film_choice.value)
    print(vip_seat.value) # checkbox will return 0 if not checked and 1 if checked
    print(row_choice.value) # displays hidden value rather than full name

app = App(title="My second GUI app", width=300, height=200, layout="grid")
film_choise = Combo(app, options=["Star Wars", "Frozen", "Lion King"], grid=[1, 0], align="left")
# because we specified layout grid for the app we can now more
# accurately place objects using the grid and alignment
film_description = Text(app, text="Which film?", grid=[0, 0], align="left")
vip_seat = CheckBox(app, text="Vip Seat?", grid=[1, 1], align="left")
row_choice = ButtonGroup(app, options=[["Front", "F"], ["Middle", "M"], ["Back", "B"]],
selected="M", horizontal=True, grid=[1, 2], align="left")
# options is a list of choices that will appear as buttons. Each
# option itself is a list containing the button label and a 
# hidden value associated with that option.
# horizontal true tells ButtonGroup to display in a horizontal
# line. 
button_description = Text(app, text="Seat Location", grid=[0, 2])
book_seats = PushButton(app, command=do_booking, text="Book Seat", grid=[1,3], align="left")

app.display()