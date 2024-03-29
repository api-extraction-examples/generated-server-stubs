from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Player(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, first_name=None, height=None, home_city=None, home_country=None, home_county_fips=None, home_latitude=None, home_longitude=None, home_state=None, id=None, jersey=None, last_name=None, position=None, recruit_ids=None, team=None, weight=None, year=None):  # noqa: E501
        """Player - a model defined in OpenAPI

        :param first_name: The first_name of this Player.  # noqa: E501
        :type first_name: str
        :param height: The height of this Player.  # noqa: E501
        :type height: int
        :param home_city: The home_city of this Player.  # noqa: E501
        :type home_city: str
        :param home_country: The home_country of this Player.  # noqa: E501
        :type home_country: str
        :param home_county_fips: The home_county_fips of this Player.  # noqa: E501
        :type home_county_fips: str
        :param home_latitude: The home_latitude of this Player.  # noqa: E501
        :type home_latitude: float
        :param home_longitude: The home_longitude of this Player.  # noqa: E501
        :type home_longitude: float
        :param home_state: The home_state of this Player.  # noqa: E501
        :type home_state: str
        :param id: The id of this Player.  # noqa: E501
        :type id: int
        :param jersey: The jersey of this Player.  # noqa: E501
        :type jersey: int
        :param last_name: The last_name of this Player.  # noqa: E501
        :type last_name: str
        :param position: The position of this Player.  # noqa: E501
        :type position: str
        :param recruit_ids: The recruit_ids of this Player.  # noqa: E501
        :type recruit_ids: List[int]
        :param team: The team of this Player.  # noqa: E501
        :type team: str
        :param weight: The weight of this Player.  # noqa: E501
        :type weight: int
        :param year: The year of this Player.  # noqa: E501
        :type year: int
        """
        self.openapi_types = {
            'first_name': str,
            'height': int,
            'home_city': str,
            'home_country': str,
            'home_county_fips': str,
            'home_latitude': float,
            'home_longitude': float,
            'home_state': str,
            'id': int,
            'jersey': int,
            'last_name': str,
            'position': str,
            'recruit_ids': List[int],
            'team': str,
            'weight': int,
            'year': int
        }

        self.attribute_map = {
            'first_name': 'first_name',
            'height': 'height',
            'home_city': 'home_city',
            'home_country': 'home_country',
            'home_county_fips': 'home_county_fips',
            'home_latitude': 'home_latitude',
            'home_longitude': 'home_longitude',
            'home_state': 'home_state',
            'id': 'id',
            'jersey': 'jersey',
            'last_name': 'last_name',
            'position': 'position',
            'recruit_ids': 'recruit_ids',
            'team': 'team',
            'weight': 'weight',
            'year': 'year'
        }

        self._first_name = first_name
        self._height = height
        self._home_city = home_city
        self._home_country = home_country
        self._home_county_fips = home_county_fips
        self._home_latitude = home_latitude
        self._home_longitude = home_longitude
        self._home_state = home_state
        self._id = id
        self._jersey = jersey
        self._last_name = last_name
        self._position = position
        self._recruit_ids = recruit_ids
        self._team = team
        self._weight = weight
        self._year = year

    @classmethod
    def from_dict(cls, dikt) -> 'Player':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Player of this Player.  # noqa: E501
        :rtype: Player
        """
        return util.deserialize_model(dikt, cls)

    @property
    def first_name(self) -> str:
        """Gets the first_name of this Player.


        :return: The first_name of this Player.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this Player.


        :param first_name: The first_name of this Player.
        :type first_name: str
        """

        self._first_name = first_name

    @property
    def height(self) -> int:
        """Gets the height of this Player.


        :return: The height of this Player.
        :rtype: int
        """
        return self._height

    @height.setter
    def height(self, height: int):
        """Sets the height of this Player.


        :param height: The height of this Player.
        :type height: int
        """

        self._height = height

    @property
    def home_city(self) -> str:
        """Gets the home_city of this Player.


        :return: The home_city of this Player.
        :rtype: str
        """
        return self._home_city

    @home_city.setter
    def home_city(self, home_city: str):
        """Sets the home_city of this Player.


        :param home_city: The home_city of this Player.
        :type home_city: str
        """

        self._home_city = home_city

    @property
    def home_country(self) -> str:
        """Gets the home_country of this Player.


        :return: The home_country of this Player.
        :rtype: str
        """
        return self._home_country

    @home_country.setter
    def home_country(self, home_country: str):
        """Sets the home_country of this Player.


        :param home_country: The home_country of this Player.
        :type home_country: str
        """

        self._home_country = home_country

    @property
    def home_county_fips(self) -> str:
        """Gets the home_county_fips of this Player.


        :return: The home_county_fips of this Player.
        :rtype: str
        """
        return self._home_county_fips

    @home_county_fips.setter
    def home_county_fips(self, home_county_fips: str):
        """Sets the home_county_fips of this Player.


        :param home_county_fips: The home_county_fips of this Player.
        :type home_county_fips: str
        """

        self._home_county_fips = home_county_fips

    @property
    def home_latitude(self) -> float:
        """Gets the home_latitude of this Player.


        :return: The home_latitude of this Player.
        :rtype: float
        """
        return self._home_latitude

    @home_latitude.setter
    def home_latitude(self, home_latitude: float):
        """Sets the home_latitude of this Player.


        :param home_latitude: The home_latitude of this Player.
        :type home_latitude: float
        """

        self._home_latitude = home_latitude

    @property
    def home_longitude(self) -> float:
        """Gets the home_longitude of this Player.


        :return: The home_longitude of this Player.
        :rtype: float
        """
        return self._home_longitude

    @home_longitude.setter
    def home_longitude(self, home_longitude: float):
        """Sets the home_longitude of this Player.


        :param home_longitude: The home_longitude of this Player.
        :type home_longitude: float
        """

        self._home_longitude = home_longitude

    @property
    def home_state(self) -> str:
        """Gets the home_state of this Player.


        :return: The home_state of this Player.
        :rtype: str
        """
        return self._home_state

    @home_state.setter
    def home_state(self, home_state: str):
        """Sets the home_state of this Player.


        :param home_state: The home_state of this Player.
        :type home_state: str
        """

        self._home_state = home_state

    @property
    def id(self) -> int:
        """Gets the id of this Player.


        :return: The id of this Player.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Player.


        :param id: The id of this Player.
        :type id: int
        """

        self._id = id

    @property
    def jersey(self) -> int:
        """Gets the jersey of this Player.


        :return: The jersey of this Player.
        :rtype: int
        """
        return self._jersey

    @jersey.setter
    def jersey(self, jersey: int):
        """Sets the jersey of this Player.


        :param jersey: The jersey of this Player.
        :type jersey: int
        """

        self._jersey = jersey

    @property
    def last_name(self) -> str:
        """Gets the last_name of this Player.


        :return: The last_name of this Player.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this Player.


        :param last_name: The last_name of this Player.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def position(self) -> str:
        """Gets the position of this Player.


        :return: The position of this Player.
        :rtype: str
        """
        return self._position

    @position.setter
    def position(self, position: str):
        """Sets the position of this Player.


        :param position: The position of this Player.
        :type position: str
        """

        self._position = position

    @property
    def recruit_ids(self) -> List[int]:
        """Gets the recruit_ids of this Player.


        :return: The recruit_ids of this Player.
        :rtype: List[int]
        """
        return self._recruit_ids

    @recruit_ids.setter
    def recruit_ids(self, recruit_ids: List[int]):
        """Sets the recruit_ids of this Player.


        :param recruit_ids: The recruit_ids of this Player.
        :type recruit_ids: List[int]
        """

        self._recruit_ids = recruit_ids

    @property
    def team(self) -> str:
        """Gets the team of this Player.


        :return: The team of this Player.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this Player.


        :param team: The team of this Player.
        :type team: str
        """

        self._team = team

    @property
    def weight(self) -> int:
        """Gets the weight of this Player.


        :return: The weight of this Player.
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight: int):
        """Sets the weight of this Player.


        :param weight: The weight of this Player.
        :type weight: int
        """

        self._weight = weight

    @property
    def year(self) -> int:
        """Gets the year of this Player.


        :return: The year of this Player.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year: int):
        """Sets the year of this Player.


        :param year: The year of this Player.
        :type year: int
        """

        self._year = year
