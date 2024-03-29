from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TeamSRSRating(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conference=None, division=None, ranking=None, rating=None, team=None, year=None):  # noqa: E501
        """TeamSRSRating - a model defined in OpenAPI

        :param conference: The conference of this TeamSRSRating.  # noqa: E501
        :type conference: str
        :param division: The division of this TeamSRSRating.  # noqa: E501
        :type division: str
        :param ranking: The ranking of this TeamSRSRating.  # noqa: E501
        :type ranking: float
        :param rating: The rating of this TeamSRSRating.  # noqa: E501
        :type rating: float
        :param team: The team of this TeamSRSRating.  # noqa: E501
        :type team: str
        :param year: The year of this TeamSRSRating.  # noqa: E501
        :type year: int
        """
        self.openapi_types = {
            'conference': str,
            'division': str,
            'ranking': float,
            'rating': float,
            'team': str,
            'year': int
        }

        self.attribute_map = {
            'conference': 'conference',
            'division': 'division',
            'ranking': 'ranking',
            'rating': 'rating',
            'team': 'team',
            'year': 'year'
        }

        self._conference = conference
        self._division = division
        self._ranking = ranking
        self._rating = rating
        self._team = team
        self._year = year

    @classmethod
    def from_dict(cls, dikt) -> 'TeamSRSRating':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamSRSRating of this TeamSRSRating.  # noqa: E501
        :rtype: TeamSRSRating
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conference(self) -> str:
        """Gets the conference of this TeamSRSRating.


        :return: The conference of this TeamSRSRating.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this TeamSRSRating.


        :param conference: The conference of this TeamSRSRating.
        :type conference: str
        """

        self._conference = conference

    @property
    def division(self) -> str:
        """Gets the division of this TeamSRSRating.


        :return: The division of this TeamSRSRating.
        :rtype: str
        """
        return self._division

    @division.setter
    def division(self, division: str):
        """Sets the division of this TeamSRSRating.


        :param division: The division of this TeamSRSRating.
        :type division: str
        """

        self._division = division

    @property
    def ranking(self) -> float:
        """Gets the ranking of this TeamSRSRating.


        :return: The ranking of this TeamSRSRating.
        :rtype: float
        """
        return self._ranking

    @ranking.setter
    def ranking(self, ranking: float):
        """Sets the ranking of this TeamSRSRating.


        :param ranking: The ranking of this TeamSRSRating.
        :type ranking: float
        """

        self._ranking = ranking

    @property
    def rating(self) -> float:
        """Gets the rating of this TeamSRSRating.


        :return: The rating of this TeamSRSRating.
        :rtype: float
        """
        return self._rating

    @rating.setter
    def rating(self, rating: float):
        """Sets the rating of this TeamSRSRating.


        :param rating: The rating of this TeamSRSRating.
        :type rating: float
        """

        self._rating = rating

    @property
    def team(self) -> str:
        """Gets the team of this TeamSRSRating.


        :return: The team of this TeamSRSRating.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this TeamSRSRating.


        :param team: The team of this TeamSRSRating.
        :type team: str
        """

        self._team = team

    @property
    def year(self) -> int:
        """Gets the year of this TeamSRSRating.


        :return: The year of this TeamSRSRating.
        :rtype: int
        """
        return self._year

    @year.setter
    def year(self, year: int):
        """Sets the year of this TeamSRSRating.


        :param year: The year of this TeamSRSRating.
        :type year: int
        """

        self._year = year
