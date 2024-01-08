from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ResourcesUlimitsInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, hard=None, name=None, soft=None):  # noqa: E501
        """ResourcesUlimitsInner - a model defined in OpenAPI

        :param hard: The hard of this ResourcesUlimitsInner.  # noqa: E501
        :type hard: int
        :param name: The name of this ResourcesUlimitsInner.  # noqa: E501
        :type name: str
        :param soft: The soft of this ResourcesUlimitsInner.  # noqa: E501
        :type soft: int
        """
        self.openapi_types = {
            'hard': int,
            'name': str,
            'soft': int
        }

        self.attribute_map = {
            'hard': 'Hard',
            'name': 'Name',
            'soft': 'Soft'
        }

        self._hard = hard
        self._name = name
        self._soft = soft

    @classmethod
    def from_dict(cls, dikt) -> 'ResourcesUlimitsInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Resources_Ulimits_inner of this ResourcesUlimitsInner.  # noqa: E501
        :rtype: ResourcesUlimitsInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def hard(self) -> int:
        """Gets the hard of this ResourcesUlimitsInner.

        Hard limit  # noqa: E501

        :return: The hard of this ResourcesUlimitsInner.
        :rtype: int
        """
        return self._hard

    @hard.setter
    def hard(self, hard: int):
        """Sets the hard of this ResourcesUlimitsInner.

        Hard limit  # noqa: E501

        :param hard: The hard of this ResourcesUlimitsInner.
        :type hard: int
        """

        self._hard = hard

    @property
    def name(self) -> str:
        """Gets the name of this ResourcesUlimitsInner.

        Name of ulimit  # noqa: E501

        :return: The name of this ResourcesUlimitsInner.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ResourcesUlimitsInner.

        Name of ulimit  # noqa: E501

        :param name: The name of this ResourcesUlimitsInner.
        :type name: str
        """

        self._name = name

    @property
    def soft(self) -> int:
        """Gets the soft of this ResourcesUlimitsInner.

        Soft limit  # noqa: E501

        :return: The soft of this ResourcesUlimitsInner.
        :rtype: int
        """
        return self._soft

    @soft.setter
    def soft(self, soft: int):
        """Sets the soft of this ResourcesUlimitsInner.

        Soft limit  # noqa: E501

        :param soft: The soft of this ResourcesUlimitsInner.
        :type soft: int
        """

        self._soft = soft
