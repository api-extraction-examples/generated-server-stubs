from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BoxScoreTeamsFieldPositionInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, average_start=None, average_starting_predicted_points=None, team=None):  # noqa: E501
        """BoxScoreTeamsFieldPositionInner - a model defined in OpenAPI

        :param average_start: The average_start of this BoxScoreTeamsFieldPositionInner.  # noqa: E501
        :type average_start: float
        :param average_starting_predicted_points: The average_starting_predicted_points of this BoxScoreTeamsFieldPositionInner.  # noqa: E501
        :type average_starting_predicted_points: float
        :param team: The team of this BoxScoreTeamsFieldPositionInner.  # noqa: E501
        :type team: str
        """
        self.openapi_types = {
            'average_start': float,
            'average_starting_predicted_points': float,
            'team': str
        }

        self.attribute_map = {
            'average_start': 'averageStart',
            'average_starting_predicted_points': 'averageStartingPredictedPoints',
            'team': 'team'
        }

        self._average_start = average_start
        self._average_starting_predicted_points = average_starting_predicted_points
        self._team = team

    @classmethod
    def from_dict(cls, dikt) -> 'BoxScoreTeamsFieldPositionInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BoxScore_teams_fieldPosition_inner of this BoxScoreTeamsFieldPositionInner.  # noqa: E501
        :rtype: BoxScoreTeamsFieldPositionInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def average_start(self) -> float:
        """Gets the average_start of this BoxScoreTeamsFieldPositionInner.


        :return: The average_start of this BoxScoreTeamsFieldPositionInner.
        :rtype: float
        """
        return self._average_start

    @average_start.setter
    def average_start(self, average_start: float):
        """Sets the average_start of this BoxScoreTeamsFieldPositionInner.


        :param average_start: The average_start of this BoxScoreTeamsFieldPositionInner.
        :type average_start: float
        """

        self._average_start = average_start

    @property
    def average_starting_predicted_points(self) -> float:
        """Gets the average_starting_predicted_points of this BoxScoreTeamsFieldPositionInner.


        :return: The average_starting_predicted_points of this BoxScoreTeamsFieldPositionInner.
        :rtype: float
        """
        return self._average_starting_predicted_points

    @average_starting_predicted_points.setter
    def average_starting_predicted_points(self, average_starting_predicted_points: float):
        """Sets the average_starting_predicted_points of this BoxScoreTeamsFieldPositionInner.


        :param average_starting_predicted_points: The average_starting_predicted_points of this BoxScoreTeamsFieldPositionInner.
        :type average_starting_predicted_points: float
        """

        self._average_starting_predicted_points = average_starting_predicted_points

    @property
    def team(self) -> str:
        """Gets the team of this BoxScoreTeamsFieldPositionInner.


        :return: The team of this BoxScoreTeamsFieldPositionInner.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this BoxScoreTeamsFieldPositionInner.


        :param team: The team of this BoxScoreTeamsFieldPositionInner.
        :type team: str
        """

        self._team = team
