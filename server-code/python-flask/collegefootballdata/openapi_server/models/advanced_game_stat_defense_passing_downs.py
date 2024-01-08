from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AdvancedGameStatDefensePassingDowns(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, explosiveness=None, ppa=None, success_rate=None):  # noqa: E501
        """AdvancedGameStatDefensePassingDowns - a model defined in OpenAPI

        :param explosiveness: The explosiveness of this AdvancedGameStatDefensePassingDowns.  # noqa: E501
        :type explosiveness: float
        :param ppa: The ppa of this AdvancedGameStatDefensePassingDowns.  # noqa: E501
        :type ppa: float
        :param success_rate: The success_rate of this AdvancedGameStatDefensePassingDowns.  # noqa: E501
        :type success_rate: float
        """
        self.openapi_types = {
            'explosiveness': float,
            'ppa': float,
            'success_rate': float
        }

        self.attribute_map = {
            'explosiveness': 'explosiveness',
            'ppa': 'ppa',
            'success_rate': 'successRate'
        }

        self._explosiveness = explosiveness
        self._ppa = ppa
        self._success_rate = success_rate

    @classmethod
    def from_dict(cls, dikt) -> 'AdvancedGameStatDefensePassingDowns':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AdvancedGameStat_defense_passingDowns of this AdvancedGameStatDefensePassingDowns.  # noqa: E501
        :rtype: AdvancedGameStatDefensePassingDowns
        """
        return util.deserialize_model(dikt, cls)

    @property
    def explosiveness(self) -> float:
        """Gets the explosiveness of this AdvancedGameStatDefensePassingDowns.


        :return: The explosiveness of this AdvancedGameStatDefensePassingDowns.
        :rtype: float
        """
        return self._explosiveness

    @explosiveness.setter
    def explosiveness(self, explosiveness: float):
        """Sets the explosiveness of this AdvancedGameStatDefensePassingDowns.


        :param explosiveness: The explosiveness of this AdvancedGameStatDefensePassingDowns.
        :type explosiveness: float
        """

        self._explosiveness = explosiveness

    @property
    def ppa(self) -> float:
        """Gets the ppa of this AdvancedGameStatDefensePassingDowns.


        :return: The ppa of this AdvancedGameStatDefensePassingDowns.
        :rtype: float
        """
        return self._ppa

    @ppa.setter
    def ppa(self, ppa: float):
        """Sets the ppa of this AdvancedGameStatDefensePassingDowns.


        :param ppa: The ppa of this AdvancedGameStatDefensePassingDowns.
        :type ppa: float
        """

        self._ppa = ppa

    @property
    def success_rate(self) -> float:
        """Gets the success_rate of this AdvancedGameStatDefensePassingDowns.


        :return: The success_rate of this AdvancedGameStatDefensePassingDowns.
        :rtype: float
        """
        return self._success_rate

    @success_rate.setter
    def success_rate(self, success_rate: float):
        """Sets the success_rate of this AdvancedGameStatDefensePassingDowns.


        :param success_rate: The success_rate of this AdvancedGameStatDefensePassingDowns.
        :type success_rate: float
        """

        self._success_rate = success_rate