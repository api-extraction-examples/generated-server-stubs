from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PositionGroupRecruitingRating(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, average_rating=None, average_stars=None, commits=None, conference=None, position_group=None, team=None, total_rating=None):  # noqa: E501
        """PositionGroupRecruitingRating - a model defined in OpenAPI

        :param average_rating: The average_rating of this PositionGroupRecruitingRating.  # noqa: E501
        :type average_rating: float
        :param average_stars: The average_stars of this PositionGroupRecruitingRating.  # noqa: E501
        :type average_stars: float
        :param commits: The commits of this PositionGroupRecruitingRating.  # noqa: E501
        :type commits: float
        :param conference: The conference of this PositionGroupRecruitingRating.  # noqa: E501
        :type conference: str
        :param position_group: The position_group of this PositionGroupRecruitingRating.  # noqa: E501
        :type position_group: str
        :param team: The team of this PositionGroupRecruitingRating.  # noqa: E501
        :type team: str
        :param total_rating: The total_rating of this PositionGroupRecruitingRating.  # noqa: E501
        :type total_rating: float
        """
        self.openapi_types = {
            'average_rating': float,
            'average_stars': float,
            'commits': float,
            'conference': str,
            'position_group': str,
            'team': str,
            'total_rating': float
        }

        self.attribute_map = {
            'average_rating': 'averageRating',
            'average_stars': 'averageStars',
            'commits': 'commits',
            'conference': 'conference',
            'position_group': 'positionGroup',
            'team': 'team',
            'total_rating': 'totalRating'
        }

        self._average_rating = average_rating
        self._average_stars = average_stars
        self._commits = commits
        self._conference = conference
        self._position_group = position_group
        self._team = team
        self._total_rating = total_rating

    @classmethod
    def from_dict(cls, dikt) -> 'PositionGroupRecruitingRating':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PositionGroupRecruitingRating of this PositionGroupRecruitingRating.  # noqa: E501
        :rtype: PositionGroupRecruitingRating
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average_rating(self) -> float:
        """Gets the average_rating of this PositionGroupRecruitingRating.


        :return: The average_rating of this PositionGroupRecruitingRating.
        :rtype: float
        """
        return self._average_rating

    @average_rating.setter
    def average_rating(self, average_rating: float):
        """Sets the average_rating of this PositionGroupRecruitingRating.


        :param average_rating: The average_rating of this PositionGroupRecruitingRating.
        :type average_rating: float
        """

        self._average_rating = average_rating

    @property
    def average_stars(self) -> float:
        """Gets the average_stars of this PositionGroupRecruitingRating.


        :return: The average_stars of this PositionGroupRecruitingRating.
        :rtype: float
        """
        return self._average_stars

    @average_stars.setter
    def average_stars(self, average_stars: float):
        """Sets the average_stars of this PositionGroupRecruitingRating.


        :param average_stars: The average_stars of this PositionGroupRecruitingRating.
        :type average_stars: float
        """

        self._average_stars = average_stars

    @property
    def commits(self) -> float:
        """Gets the commits of this PositionGroupRecruitingRating.


        :return: The commits of this PositionGroupRecruitingRating.
        :rtype: float
        """
        return self._commits

    @commits.setter
    def commits(self, commits: float):
        """Sets the commits of this PositionGroupRecruitingRating.


        :param commits: The commits of this PositionGroupRecruitingRating.
        :type commits: float
        """

        self._commits = commits

    @property
    def conference(self) -> str:
        """Gets the conference of this PositionGroupRecruitingRating.


        :return: The conference of this PositionGroupRecruitingRating.
        :rtype: str
        """
        return self._conference

    @conference.setter
    def conference(self, conference: str):
        """Sets the conference of this PositionGroupRecruitingRating.


        :param conference: The conference of this PositionGroupRecruitingRating.
        :type conference: str
        """

        self._conference = conference

    @property
    def position_group(self) -> str:
        """Gets the position_group of this PositionGroupRecruitingRating.


        :return: The position_group of this PositionGroupRecruitingRating.
        :rtype: str
        """
        return self._position_group

    @position_group.setter
    def position_group(self, position_group: str):
        """Sets the position_group of this PositionGroupRecruitingRating.


        :param position_group: The position_group of this PositionGroupRecruitingRating.
        :type position_group: str
        """

        self._position_group = position_group

    @property
    def team(self) -> str:
        """Gets the team of this PositionGroupRecruitingRating.


        :return: The team of this PositionGroupRecruitingRating.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this PositionGroupRecruitingRating.


        :param team: The team of this PositionGroupRecruitingRating.
        :type team: str
        """

        self._team = team

    @property
    def total_rating(self) -> float:
        """Gets the total_rating of this PositionGroupRecruitingRating.


        :return: The total_rating of this PositionGroupRecruitingRating.
        :rtype: float
        """
        return self._total_rating

    @total_rating.setter
    def total_rating(self, total_rating: float):
        """Sets the total_rating of this PositionGroupRecruitingRating.


        :param total_rating: The total_rating of this PositionGroupRecruitingRating.
        :type total_rating: float
        """

        self._total_rating = total_rating
