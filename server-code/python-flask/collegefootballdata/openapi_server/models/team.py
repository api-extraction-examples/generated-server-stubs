from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_location import TeamLocation
from openapi_server import util

from openapi_server.models.team_location import TeamLocation  # noqa: E501

class Team(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, abbreviation=None, alt_color=None, alt_name_1=None, alt_name_2=None, alt_name_3=None, classification=None, color=None, conference=None, division=None, id=None, location=None, logos=None, mascot=None, school=None, twitter=None):  # noqa: E501
        """Team - a model defined in OpenAPI

        :param abbreviation: The abbreviation of this Team.  # noqa: E501
        :type abbreviation: str
        :param alt_color: The alt_color of this Team.  # noqa: E501
        :type alt_color: str
        :param alt_name_1: The alt_name_1 of this Team.  # noqa: E501
        :type alt_name_1: str
        :param alt_name_2: The alt_name_2 of this Team.  # noqa: E501
        :type alt_name_2: str
        :param alt_name_3: The alt_name_3 of this Team.  # noqa: E501
        :type alt_name_3: str
        :param classification: The classification of this Team.  # noqa: E501
        :type classification: str
        :param color: The color of this Team.  # noqa: E501
        :type color: str
        :param conference: The conference of this Team.  # noqa: E501
        :type conference: str
        :param division: The division of this Team.  # noqa: E501
        :type division: str
        :param id: The id of this Team.  # noqa: E501
        :type id: int
        :param location: The location of this Team.  # noqa: E501
        :type location: TeamLocation
        :param logos: The logos of this Team.  # noqa: E501
        :type logos: List[str]
        :param mascot: The mascot of this Team.  # noqa: E501
        :type mascot: str
        :param school: The school of this Team.  # noqa: E501
        :type school: str
        :param twitter: The twitter of this Team.  # noqa: E501
        :type twitter: str
        """
        self.openapi_types = {
            'abbreviation': str,
            'alt_color': str,
            'alt_name_1': str,
            'alt_name_2': str,
            'alt_name_3': str,
            'classification': str,
            'color': str,
            'conference': str,
            'division': str,
            'id': int,
            'location': TeamLocation,
            'logos': List[str],
            'mascot': str,
            'school': str,
            'twitter': str
        }

        self.attribute_map = {
            'abbreviation': 'abbreviation',
            'alt_color': 'alt_color',
            'alt_name_1': 'alt_name_1',
            'alt_name_2': 'alt_name_2',
            'alt_name_3': 'alt_name_3',
            'classification': 'classification',
            'color': 'color',
            'conference': 'conference',
            'division': 'division',
            'id': 'id',
            'location': 'location',
            'logos': 'logos',
            'mascot': 'mascot',
            'school': 'school',
            'twitter': 'twitter'
        }

        self._abbreviation = abbreviation
        self._alt_color = alt_color
        self._alt_name_1 = alt_name_1
        self._alt_name_2 = alt_name_2
        self._alt_name_3 = alt_name_3
        self._classification = classification
        self._color = color
        self._conference = conference
        self._division = division
        self._id = id
        self._location = location
        self._logos = logos
        self._mascot = mascot
        self._school = school
        self._twitter = twitter

    @classmethod
    def from_dict(cls, dikt) -> 'Team':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Team of this Team.  # noqa: E501
        :rtype: Team
        """
        return util.deserialize_model(dikt, cls)

    @property
    def abbreviation(self) -> str:
        """Gets the abbreviation of this Team.


        :return: The abbreviation of this Team.
        :rtype: str
        """
        return self._abbreviation

    @abbreviation.setter
    def abbreviation(self, abbreviation: str):
        """Sets the abbreviation of this Team.


        :param abbreviation: The abbreviation of this Team.
        :type abbreviation: str
        """

        self._abbreviation = abbreviation

    @property
    def alt_color(self) -> str:
        """Gets the alt_color of this Team.


        :return: The alt_color of this Team.
        :rtype: str
        """
        return self._alt_color

    @alt_color.setter
    def alt_color(self, alt_color: str):
        """Sets the alt_color of this Team.


        :param alt_color: The alt_color of this Team.
        :type alt_color: str
        """

        self._alt_color = alt_color

    @property
    def alt_name_1(self) -> str:
        """Gets the alt_name_1 of this Team.


        :return: The alt_name_1 of this Team.
        :rtype: str
        """
        return self._alt_name_1

    @alt_name_1.setter
    def alt_name_1(self, alt_name_1: str):
        """Sets the alt_name_1 of this Team.


        :param alt_name_1: The alt_name_1 of this Team.
        :type alt_name_1: str
        """

        self._alt_name_1 = alt_name_1

    @property
    def alt_name_2(self) -> str:
        """Gets the alt_name_2 of this Team.


        :return: The alt_name_2 of this Team.
        :rtype: str
        """
        return self._alt_name_2

    @alt_name_2.setter
    def alt_name_2(self, alt_name_2: str):
        """Sets the alt_name_2 of this Team.


        :param alt_name_2: The alt_name_2 of this Team.
        :type alt_name_2: str
        """

        self._alt_name_2 = alt_name_2

    @property
    def alt_name_3(self) -> str:
        """Gets the alt_name_3 of this Team.


        :return: The alt_name_3 of this Team.
        :rtype: str
        """
        return self._alt_name_3

    @alt_name_3.setter
    def alt_name_3(self, alt_name_3: str):
        """Sets the alt_name_3 of this Team.


        :param alt_name_3: The alt_name_3 of this Team.
        :type alt_name_3: str
        """

        self._alt_name_3 = alt_name_3

    @property
    def classification(self) -> str:
        """Gets the classification of this Team.


        :return: The classification of this Team.
        :rtype: str
        """
        return self._classification

    @classification.setter
    def classification(self, classification: str):
        """Sets the classification of this Team.


        :param classification: The classification of this Team.
        :type classification: str
        """

        self._classification = classification

    @property
    def color(self) -> str:
        """Gets the color of this Team.


        :return: The color of this Team.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this Team.


        :param color: The color of this Team.
        :type color: str
        """

        self._color = color

    @property
    def conference(self) -> str:
        """Gets the conference of this Team.


        :return: The conference of this Team.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this Team.


        :param conference: The conference of this Team.
        :type conference: str
        """

        self._conference = conference

    @property
    def division(self) -> str:
        """Gets the division of this Team.


        :return: The division of this Team.
        :rtype: str
        """
        return self._division

    @division.setter
    def division(self, division: str):
        """Sets the division of this Team.


        :param division: The division of this Team.
        :type division: str
        """

        self._division = division

    @property
    def id(self) -> int:
        """Gets the id of this Team.


        :return: The id of this Team.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this Team.


        :param id: The id of this Team.
        :type id: int
        """

        self._id = id

    @property
    def location(self) -> TeamLocation:
        """Gets the location of this Team.


        :return: The location of this Team.
        :rtype: TeamLocation
        """
        return self._location

    @location.setter
    def location(self, location: TeamLocation):
        """Sets the location of this Team.


        :param location: The location of this Team.
        :type location: TeamLocation
        """

        self._location = location

    @property
    def logos(self) -> List[str]:
        """Gets the logos of this Team.


        :return: The logos of this Team.
        :rtype: List[str]
        """
        return self._logos

    @logos.setter
    def logos(self, logos: List[str]):
        """Sets the logos of this Team.


        :param logos: The logos of this Team.
        :type logos: List[str]
        """

        self._logos = logos

    @property
    def mascot(self) -> str:
        """Gets the mascot of this Team.


        :return: The mascot of this Team.
        :rtype: str
        """
        return self._mascot

    @mascot.setter
    def mascot(self, mascot: str):
        """Sets the mascot of this Team.


        :param mascot: The mascot of this Team.
        :type mascot: str
        """

        self._mascot = mascot

    @property
    def school(self) -> str:
        """Gets the school of this Team.


        :return: The school of this Team.
        :rtype: str
        """
        return self._school

    @school.setter
    def school(self, school: str):
        """Sets the school of this Team.


        :param school: The school of this Team.
        :type school: str
        """

        self._school = school

    @property
    def twitter(self) -> str:
        """Gets the twitter of this Team.


        :return: The twitter of this Team.
        :rtype: str
        """
        return self._twitter

    @twitter.setter
    def twitter(self, twitter: str):
        """Sets the twitter of this Team.


        :param twitter: The twitter of this Team.
        :type twitter: str
        """

        self._twitter = twitter
