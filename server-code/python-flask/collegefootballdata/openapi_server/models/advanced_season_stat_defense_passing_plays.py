from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AdvancedSeasonStatDefensePassingPlays(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, explosiveness=None, ppa=None, rate=None, success_rate=None, total_ppa=None):  # noqa: E501
        """AdvancedSeasonStatDefensePassingPlays - a model defined in OpenAPI

        :param explosiveness: The explosiveness of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :type explosiveness: float
        :param ppa: The ppa of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :type ppa: float
        :param rate: The rate of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :type rate: float
        :param success_rate: The success_rate of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :type success_rate: float
        :param total_ppa: The total_ppa of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :type total_ppa: float
        """
        self.openapi_types = {
            'explosiveness': float,
            'ppa': float,
            'rate': float,
            'success_rate': float,
            'total_ppa': float
        }

        self.attribute_map = {
            'explosiveness': 'explosiveness',
            'ppa': 'ppa',
            'rate': 'rate',
            'success_rate': 'successRate',
            'total_ppa': 'totalPPA'
        }

        self._explosiveness = explosiveness
        self._ppa = ppa
        self._rate = rate
        self._success_rate = success_rate
        self._total_ppa = total_ppa

    @classmethod
    def from_dict(cls, dikt) -> 'AdvancedSeasonStatDefensePassingPlays':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AdvancedSeasonStat_defense_passingPlays of this AdvancedSeasonStatDefensePassingPlays.  # noqa: E501
        :rtype: AdvancedSeasonStatDefensePassingPlays
        """
        return util.deserialize_model(dikt, cls)

    @property
    def explosiveness(self) -> float:
        """Gets the explosiveness of this AdvancedSeasonStatDefensePassingPlays.


        :return: The explosiveness of this AdvancedSeasonStatDefensePassingPlays.
        :rtype: float
        """
        return self._explosiveness

    @explosiveness.setter
    def explosiveness(self, explosiveness: float):
        """Sets the explosiveness of this AdvancedSeasonStatDefensePassingPlays.


        :param explosiveness: The explosiveness of this AdvancedSeasonStatDefensePassingPlays.
        :type explosiveness: float
        """

        self._explosiveness = explosiveness

    @property
    def ppa(self) -> float:
        """Gets the ppa of this AdvancedSeasonStatDefensePassingPlays.


        :return: The ppa of this AdvancedSeasonStatDefensePassingPlays.
        :rtype: float
        """
        return self._ppa

    @ppa.setter
    def ppa(self, ppa: float):
        """Sets the ppa of this AdvancedSeasonStatDefensePassingPlays.


        :param ppa: The ppa of this AdvancedSeasonStatDefensePassingPlays.
        :type ppa: float
        """

        self._ppa = ppa

    @property
    def rate(self) -> float:
        """Gets the rate of this AdvancedSeasonStatDefensePassingPlays.


        :return: The rate of this AdvancedSeasonStatDefensePassingPlays.
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate: float):
        """Sets the rate of this AdvancedSeasonStatDefensePassingPlays.


        :param rate: The rate of this AdvancedSeasonStatDefensePassingPlays.
        :type rate: float
        """

        self._rate = rate

    @property
    def success_rate(self) -> float:
        """Gets the success_rate of this AdvancedSeasonStatDefensePassingPlays.


        :return: The success_rate of this AdvancedSeasonStatDefensePassingPlays.
        :rtype: float
        """
        return self._success_rate

    @success_rate.setter
    def success_rate(self, success_rate: float):
        """Sets the success_rate of this AdvancedSeasonStatDefensePassingPlays.


        :param success_rate: The success_rate of this AdvancedSeasonStatDefensePassingPlays.
        :type success_rate: float
        """

        self._success_rate = success_rate

    @property
    def total_ppa(self) -> float:
        """Gets the total_ppa of this AdvancedSeasonStatDefensePassingPlays.


        :return: The total_ppa of this AdvancedSeasonStatDefensePassingPlays.
        :rtype: float
        """
        return self._total_ppa

    @total_ppa.setter
    def total_ppa(self, total_ppa: float):
        """Sets the total_ppa of this AdvancedSeasonStatDefensePassingPlays.


        :param total_ppa: The total_ppa of this AdvancedSeasonStatDefensePassingPlays.
        :type total_ppa: float
        """

        self._total_ppa = total_ppa
