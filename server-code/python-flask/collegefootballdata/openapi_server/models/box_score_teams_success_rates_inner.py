from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.box_score_teams_cumulative_ppa_inner_overall import BoxScoreTeamsCumulativePpaInnerOverall
from openapi_server import util

from openapi_server.models.box_score_teams_cumulative_ppa_inner_overall import BoxScoreTeamsCumulativePpaInnerOverall  # noqa: E501

class BoxScoreTeamsSuccessRatesInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, overall=None, passing_downs=None, standard_downs=None, team=None):  # noqa: E501
        """BoxScoreTeamsSuccessRatesInner - a model defined in OpenAPI

        :param overall: The overall of this BoxScoreTeamsSuccessRatesInner.  # noqa: E501
        :type overall: BoxScoreTeamsCumulativePpaInnerOverall
        :param passing_downs: The passing_downs of this BoxScoreTeamsSuccessRatesInner.  # noqa: E501
        :type passing_downs: BoxScoreTeamsCumulativePpaInnerOverall
        :param standard_downs: The standard_downs of this BoxScoreTeamsSuccessRatesInner.  # noqa: E501
        :type standard_downs: BoxScoreTeamsCumulativePpaInnerOverall
        :param team: The team of this BoxScoreTeamsSuccessRatesInner.  # noqa: E501
        :type team: str
        """
        self.openapi_types = {
            'overall': BoxScoreTeamsCumulativePpaInnerOverall,
            'passing_downs': BoxScoreTeamsCumulativePpaInnerOverall,
            'standard_downs': BoxScoreTeamsCumulativePpaInnerOverall,
            'team': str
        }

        self.attribute_map = {
            'overall': 'overall',
            'passing_downs': 'passingDowns',
            'standard_downs': 'standardDowns',
            'team': 'team'
        }

        self._overall = overall
        self._passing_downs = passing_downs
        self._standard_downs = standard_downs
        self._team = team

    @classmethod
    def from_dict(cls, dikt) -> 'BoxScoreTeamsSuccessRatesInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BoxScore_teams_successRates_inner of this BoxScoreTeamsSuccessRatesInner.  # noqa: E501
        :rtype: BoxScoreTeamsSuccessRatesInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def overall(self) -> BoxScoreTeamsCumulativePpaInnerOverall:
        """Gets the overall of this BoxScoreTeamsSuccessRatesInner.


        :return: The overall of this BoxScoreTeamsSuccessRatesInner.
        :rtype: BoxScoreTeamsCumulativePpaInnerOverall
        """
        return self._overall

    @overall.setter
    def overall(self, overall: BoxScoreTeamsCumulativePpaInnerOverall):
        """Sets the overall of this BoxScoreTeamsSuccessRatesInner.


        :param overall: The overall of this BoxScoreTeamsSuccessRatesInner.
        :type overall: BoxScoreTeamsCumulativePpaInnerOverall
        """

        self._overall = overall

    @property
    def passing_downs(self) -> BoxScoreTeamsCumulativePpaInnerOverall:
        """Gets the passing_downs of this BoxScoreTeamsSuccessRatesInner.


        :return: The passing_downs of this BoxScoreTeamsSuccessRatesInner.
        :rtype: BoxScoreTeamsCumulativePpaInnerOverall
        """
        return self._passing_downs

    @passing_downs.setter
    def passing_downs(self, passing_downs: BoxScoreTeamsCumulativePpaInnerOverall):
        """Sets the passing_downs of this BoxScoreTeamsSuccessRatesInner.


        :param passing_downs: The passing_downs of this BoxScoreTeamsSuccessRatesInner.
        :type passing_downs: BoxScoreTeamsCumulativePpaInnerOverall
        """

        self._passing_downs = passing_downs

    @property
    def standard_downs(self) -> BoxScoreTeamsCumulativePpaInnerOverall:
        """Gets the standard_downs of this BoxScoreTeamsSuccessRatesInner.


        :return: The standard_downs of this BoxScoreTeamsSuccessRatesInner.
        :rtype: BoxScoreTeamsCumulativePpaInnerOverall
        """
        return self._standard_downs

    @standard_downs.setter
    def standard_downs(self, standard_downs: BoxScoreTeamsCumulativePpaInnerOverall):
        """Sets the standard_downs of this BoxScoreTeamsSuccessRatesInner.


        :param standard_downs: The standard_downs of this BoxScoreTeamsSuccessRatesInner.
        :type standard_downs: BoxScoreTeamsCumulativePpaInnerOverall
        """

        self._standard_downs = standard_downs

    @property
    def team(self) -> str:
        """Gets the team of this BoxScoreTeamsSuccessRatesInner.


        :return: The team of this BoxScoreTeamsSuccessRatesInner.
        :rtype: str
        """
        return self._team

    @team.setter
    def team(self, team: str):
        """Sets the team of this BoxScoreTeamsSuccessRatesInner.


        :param team: The team of this BoxScoreTeamsSuccessRatesInner.
        :type team: str
        """

        self._team = team