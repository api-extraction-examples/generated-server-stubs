from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccountUsageCapability(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, included=None, used=None):  # noqa: E501
        """AccountUsageCapability - a model defined in OpenAPI

        :param included: The included of this AccountUsageCapability.  # noqa: E501
        :type included: int
        :param used: The used of this AccountUsageCapability.  # noqa: E501
        :type used: int
        """
        self.openapi_types = {
            'included': int,
            'used': int
        }

        self.attribute_map = {
            'included': 'included',
            'used': 'used'
        }

        self._included = included
        self._used = used

    @classmethod
    def from_dict(cls, dikt) -> 'AccountUsageCapability':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The accountUsageCapability of this AccountUsageCapability.  # noqa: E501
        :rtype: AccountUsageCapability
        """
        return util.deserialize_model(dikt, cls)

    @property
    def included(self) -> int:
        """Gets the included of this AccountUsageCapability.


        :return: The included of this AccountUsageCapability.
        :rtype: int
        """
        return self._included

    @included.setter
    def included(self, included: int):
        """Sets the included of this AccountUsageCapability.


        :param included: The included of this AccountUsageCapability.
        :type included: int
        """

        self._included = included

    @property
    def used(self) -> int:
        """Gets the used of this AccountUsageCapability.


        :return: The used of this AccountUsageCapability.
        :rtype: int
        """
        return self._used

    @used.setter
    def used(self, used: int):
        """Sets the used of this AccountUsageCapability.


        :param used: The used of this AccountUsageCapability.
        :type used: int
        """

        self._used = used