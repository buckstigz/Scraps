import pyowm
from datetime import datetime, timedelta

owm = pyowm.debc9e34530c9def6b23ef85954580cc
COUNTRY = 'UK'

owm.daily_forecast('london,uk')
