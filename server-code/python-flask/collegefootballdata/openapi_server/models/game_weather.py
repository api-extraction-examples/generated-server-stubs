from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class GameWeather(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, away_conference=None, away_team=None, dew_point=None, game_indoors=None, home_conference=None, home_team=None, humidity=None, id=None, precipitation=None, pressure=None, season=None, season_type=None, snowfall=None, start_time=None, temperature=None, venue=None, venue_id=None, weather_condition=None, weather_condition_code=None, week=None, wind_direction=None, wind_speed=None):  # noqa: E501
        """GameWeather - a model defined in OpenAPI

        :param away_conference: The away_conference of this GameWeather.  # noqa: E501
        :type away_conference: str
        :param away_team: The away_team of this GameWeather.  # noqa: E501
        :type away_team: str
        :param dew_point: The dew_point of this GameWeather.  # noqa: E501
        :type dew_point: float
        :param game_indoors: The game_indoors of this GameWeather.  # noqa: E501
        :type game_indoors: bool
        :param home_conference: The home_conference of this GameWeather.  # noqa: E501
        :type home_conference: str
        :param home_team: The home_team of this GameWeather.  # noqa: E501
        :type home_team: str
        :param humidity: The humidity of this GameWeather.  # noqa: E501
        :type humidity: float
        :param id: The id of this GameWeather.  # noqa: E501
        :type id: int
        :param precipitation: The precipitation of this GameWeather.  # noqa: E501
        :type precipitation: float
        :param pressure: The pressure of this GameWeather.  # noqa: E501
        :type pressure: float
        :param season: The season of this GameWeather.  # noqa: E501
        :type season: int
        :param season_type: The season_type of this GameWeather.  # noqa: E501
        :type season_type: str
        :param snowfall: The snowfall of this GameWeather.  # noqa: E501
        :type snowfall: float
        :param start_time: The start_time of this GameWeather.  # noqa: E501
        :type start_time: str
        :param temperature: The temperature of this GameWeather.  # noqa: E501
        :type temperature: float
        :param venue: The venue of this GameWeather.  # noqa: E501
        :type venue: str
        :param venue_id: The venue_id of this GameWeather.  # noqa: E501
        :type venue_id: int
        :param weather_condition: The weather_condition of this GameWeather.  # noqa: E501
        :type weather_condition: str
        :param weather_condition_code: The weather_condition_code of this GameWeather.  # noqa: E501
        :type weather_condition_code: int
        :param week: The week of this GameWeather.  # noqa: E501
        :type week: int
        :param wind_direction: The wind_direction of this GameWeather.  # noqa: E501
        :type wind_direction: float
        :param wind_speed: The wind_speed of this GameWeather.  # noqa: E501
        :type wind_speed: float
        """
        self.openapi_types = {
            'away_conference': str,
            'away_team': str,
            'dew_point': float,
            'game_indoors': bool,
            'home_conference': str,
            'home_team': str,
            'humidity': float,
            'id': int,
            'precipitation': float,
            'pressure': float,
            'season': int,
            'season_type': str,
            'snowfall': float,
            'start_time': str,
            'temperature': float,
            'venue': str,
            'venue_id': int,
            'weather_condition': str,
            'weather_condition_code': int,
            'week': int,
            'wind_direction': float,
            'wind_speed': float
        }

        self.attribute_map = {
            'away_conference': 'awayConference',
            'away_team': 'awayTeam',
            'dew_point': 'dewPoint',
            'game_indoors': 'gameIndoors',
            'home_conference': 'homeConference',
            'home_team': 'homeTeam',
            'humidity': 'humidity',
            'id': 'id',
            'precipitation': 'precipitation',
            'pressure': 'pressure',
            'season': 'season',
            'season_type': 'seasonType',
            'snowfall': 'snowfall',
            'start_time': 'startTime',
            'temperature': 'temperature',
            'venue': 'venue',
            'venue_id': 'venueId',
            'weather_condition': 'weatherCondition',
            'weather_condition_code': 'weatherConditionCode',
            'week': 'week',
            'wind_direction': 'windDirection',
            'wind_speed': 'windSpeed'
        }

        self._away_conference = away_conference
        self._away_team = away_team
        self._dew_point = dew_point
        self._game_indoors = game_indoors
        self._home_conference = home_conference
        self._home_team = home_team
        self._humidity = humidity
        self._id = id
        self._precipitation = precipitation
        self._pressure = pressure
        self._season = season
        self._season_type = season_type
        self._snowfall = snowfall
        self._start_time = start_time
        self._temperature = temperature
        self._venue = venue
        self._venue_id = venue_id
        self._weather_condition = weather_condition
        self._weather_condition_code = weather_condition_code
        self._week = week
        self._wind_direction = wind_direction
        self._wind_speed = wind_speed

    @classmethod
    def from_dict(cls, dikt) -> 'GameWeather':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GameWeather of this GameWeather.  # noqa: E501
        :rtype: GameWeather
        """
        return util.deserialize_model(dikt, cls)

    @property
    def away_conference(self) -> str:
        """Gets the away_conference of this GameWeather.


        :return: The away_conference of this GameWeather.
        :rtype: str
        """
        return self._away_conference

    @away_conference.setter
    def away_conference(self, away_conference: str):
        """Sets the away_conference of this GameWeather.


        :param away_conference: The away_conference of this GameWeather.
        :type away_conference: str
        """

        self._away_conference = away_conference

    @property
    def away_team(self) -> str:
        """Gets the away_team of this GameWeather.


        :return: The away_team of this GameWeather.
        :rtype: str
        """
        return self._away_team

    @away_team.setter
    def away_team(self, away_team: str):
        """Sets the away_team of this GameWeather.


        :param away_team: The away_team of this GameWeather.
        :type away_team: str
        """

        self._away_team = away_team

    @property
    def dew_point(self) -> float:
        """Gets the dew_point of this GameWeather.


        :return: The dew_point of this GameWeather.
        :rtype: float
        """
        return self._dew_point

    @dew_point.setter
    def dew_point(self, dew_point: float):
        """Sets the dew_point of this GameWeather.


        :param dew_point: The dew_point of this GameWeather.
        :type dew_point: float
        """

        self._dew_point = dew_point

    @property
    def game_indoors(self) -> bool:
        """Gets the game_indoors of this GameWeather.


        :return: The game_indoors of this GameWeather.
        :rtype: bool
        """
        return self._game_indoors

    @game_indoors.setter
    def game_indoors(self, game_indoors: bool):
        """Sets the game_indoors of this GameWeather.


        :param game_indoors: The game_indoors of this GameWeather.
        :type game_indoors: bool
        """

        self._game_indoors = game_indoors

    @property
    def home_conference(self) -> str:
        """Gets the home_conference of this GameWeather.


        :return: The home_conference of this GameWeather.
        :rtype: str
        """
        return self._home_conference

    @home_conference.setter
    def home_conference(self, home_conference: str):
        """Sets the home_conference of this GameWeather.


        :param home_conference: The home_conference of this GameWeather.
        :type home_conference: str
        """

        self._home_conference = home_conference

    @property
    def home_team(self) -> str:
        """Gets the home_team of this GameWeather.


        :return: The home_team of this GameWeather.
        :rtype: str
        """
        return self._home_team

    @home_team.setter
    def home_team(self, home_team: str):
        """Sets the home_team of this GameWeather.


        :param home_team: The home_team of this GameWeather.
        :type home_team: str
        """

        self._home_team = home_team

    @property
    def humidity(self) -> float:
        """Gets the humidity of this GameWeather.


        :return: The humidity of this GameWeather.
        :rtype: float
        """
        return self._humidity

    @humidity.setter
    def humidity(self, humidity: float):
        """Sets the humidity of this GameWeather.


        :param humidity: The humidity of this GameWeather.
        :type humidity: float
        """

        self._humidity = humidity

    @property
    def id(self) -> int:
        """Gets the id of this GameWeather.


        :return: The id of this GameWeather.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this GameWeather.


        :param id: The id of this GameWeather.
        :type id: int
        """

        self._id = id

    @property
    def precipitation(self) -> float:
        """Gets the precipitation of this GameWeather.


        :return: The precipitation of this GameWeather.
        :rtype: float
        """
        return self._precipitation

    @precipitation.setter
    def precipitation(self, precipitation: float):
        """Sets the precipitation of this GameWeather.


        :param precipitation: The precipitation of this GameWeather.
        :type precipitation: float
        """

        self._precipitation = precipitation

    @property
    def pressure(self) -> float:
        """Gets the pressure of this GameWeather.


        :return: The pressure of this GameWeather.
        :rtype: float
        """
        return self._pressure

    @pressure.setter
    def pressure(self, pressure: float):
        """Sets the pressure of this GameWeather.


        :param pressure: The pressure of this GameWeather.
        :type pressure: float
        """

        self._pressure = pressure

    @property
    def season(self) -> int:
        """Gets the season of this GameWeather.


        :return: The season of this GameWeather.
        :rtype: int
        """
        return self._season

    @season.setter
    def season(self, season: int):
        """Sets the season of this GameWeather.


        :param season: The season of this GameWeather.
        :type season: int
        """

        self._season = season

    @property
    def season_type(self) -> str:
        """Gets the season_type of this GameWeather.


        :return: The season_type of this GameWeather.
        :rtype: str
        """
        return self._season_type

    @season_type.setter
    def season_type(self, season_type: str):
        """Sets the season_type of this GameWeather.


        :param season_type: The season_type of this GameWeather.
        :type season_type: str
        """

        self._season_type = season_type

    @property
    def snowfall(self) -> float:
        """Gets the snowfall of this GameWeather.


        :return: The snowfall of this GameWeather.
        :rtype: float
        """
        return self._snowfall

    @snowfall.setter
    def snowfall(self, snowfall: float):
        """Sets the snowfall of this GameWeather.


        :param snowfall: The snowfall of this GameWeather.
        :type snowfall: float
        """

        self._snowfall = snowfall

    @property
    def start_time(self) -> str:
        """Gets the start_time of this GameWeather.


        :return: The start_time of this GameWeather.
        :rtype: str
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time: str):
        """Sets the start_time of this GameWeather.


        :param start_time: The start_time of this GameWeather.
        :type start_time: str
        """

        self._start_time = start_time

    @property
    def temperature(self) -> float:
        """Gets the temperature of this GameWeather.


        :return: The temperature of this GameWeather.
        :rtype: float
        """
        return self._temperature

    @temperature.setter
    def temperature(self, temperature: float):
        """Sets the temperature of this GameWeather.


        :param temperature: The temperature of this GameWeather.
        :type temperature: float
        """

        self._temperature = temperature

    @property
    def venue(self) -> str:
        """Gets the venue of this GameWeather.


        :return: The venue of this GameWeather.
        :rtype: str
        """
        return self._venue

    @venue.setter
    def venue(self, venue: str):
        """Sets the venue of this GameWeather.


        :param venue: The venue of this GameWeather.
        :type venue: str
        """

        self._venue = venue

    @property
    def venue_id(self) -> int:
        """Gets the venue_id of this GameWeather.


        :return: The venue_id of this GameWeather.
        :rtype: int
        """
        return self._venue_id

    @venue_id.setter
    def venue_id(self, venue_id: int):
        """Sets the venue_id of this GameWeather.


        :param venue_id: The venue_id of this GameWeather.
        :type venue_id: int
        """

        self._venue_id = venue_id

    @property
    def weather_condition(self) -> str:
        """Gets the weather_condition of this GameWeather.


        :return: The weather_condition of this GameWeather.
        :rtype: str
        """
        return self._weather_condition

    @weather_condition.setter
    def weather_condition(self, weather_condition: str):
        """Sets the weather_condition of this GameWeather.


        :param weather_condition: The weather_condition of this GameWeather.
        :type weather_condition: str
        """

        self._weather_condition = weather_condition

    @property
    def weather_condition_code(self) -> int:
        """Gets the weather_condition_code of this GameWeather.


        :return: The weather_condition_code of this GameWeather.
        :rtype: int
        """
        return self._weather_condition_code

    @weather_condition_code.setter
    def weather_condition_code(self, weather_condition_code: int):
        """Sets the weather_condition_code of this GameWeather.


        :param weather_condition_code: The weather_condition_code of this GameWeather.
        :type weather_condition_code: int
        """

        self._weather_condition_code = weather_condition_code

    @property
    def week(self) -> int:
        """Gets the week of this GameWeather.


        :return: The week of this GameWeather.
        :rtype: int
        """
        return self._week

    @week.setter
    def week(self, week: int):
        """Sets the week of this GameWeather.


        :param week: The week of this GameWeather.
        :type week: int
        """

        self._week = week

    @property
    def wind_direction(self) -> float:
        """Gets the wind_direction of this GameWeather.


        :return: The wind_direction of this GameWeather.
        :rtype: float
        """
        return self._wind_direction

    @wind_direction.setter
    def wind_direction(self, wind_direction: float):
        """Sets the wind_direction of this GameWeather.


        :param wind_direction: The wind_direction of this GameWeather.
        :type wind_direction: float
        """

        self._wind_direction = wind_direction

    @property
    def wind_speed(self) -> float:
        """Gets the wind_speed of this GameWeather.


        :return: The wind_speed of this GameWeather.
        :rtype: float
        """
        return self._wind_speed

    @wind_speed.setter
    def wind_speed(self, wind_speed: float):
        """Sets the wind_speed of this GameWeather.


        :param wind_speed: The wind_speed of this GameWeather.
        :type wind_speed: float
        """

        self._wind_speed = wind_speed
