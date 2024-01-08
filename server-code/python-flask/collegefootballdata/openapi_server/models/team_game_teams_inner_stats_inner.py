from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TeamGameTeamsInnerStatsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category=None, stat=None):  # noqa: E501
        """TeamGameTeamsInnerStatsInner - a model defined in OpenAPI

        :param category: The category of this TeamGameTeamsInnerStatsInner.  # noqa: E501
        :type category: str
        :param stat: The stat of this TeamGameTeamsInnerStatsInner.  # noqa: E501
        :type stat: str
        """
        self.openapi_types = {
            'category': str,
            'stat': str
        }

        self.attribute_map = {
            'category': 'category',
            'stat': 'stat'
        }

        self._category = category
        self._stat = stat

    @classmethod
    def from_dict(cls, dikt) -> 'TeamGameTeamsInnerStatsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamGame_teams_inner_stats_inner of this TeamGameTeamsInnerStatsInner.  # noqa: E501
        :rtype: TeamGameTeamsInnerStatsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category(self) -> str:
        """Gets the category of this TeamGameTeamsInnerStatsInner.


        :return: The category of this TeamGameTeamsInnerStatsInner.
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category: str):
        """Sets the category of this TeamGameTeamsInnerStatsInner.


        :param category: The category of this TeamGameTeamsInnerStatsInner.
        :type category: str
        """

        self._category = category

    @property
    def stat(self) -> str:
        """Gets the stat of this TeamGameTeamsInnerStatsInner.


        :return: The stat of this TeamGameTeamsInnerStatsInner.
        :rtype: str
        """
        return self._stat

    @stat.setter
    def stat(self, stat: str):
        """Sets the stat of this TeamGameTeamsInnerStatsInner.


        :param stat: The stat of this TeamGameTeamsInnerStatsInner.
        :type stat: str
        """

        self._stat = stat
