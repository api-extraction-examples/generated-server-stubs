from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class Periods(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _from=None, until=None):  # noqa: E501
        """Periods - a model defined in OpenAPI

        :param _from: The _from of this Periods.  # noqa: E501
        :type _from: str
        :param until: The until of this Periods.  # noqa: E501
        :type until: str
        """
        self.openapi_types = {
            '_from': str,
            'until': str
        }

        self.attribute_map = {
            '_from': 'from',
            'until': 'until'
        }

        self.__from = _from
        self._until = until

    @classmethod
    def from_dict(cls, dikt) -> 'Periods':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Periods of this Periods.  # noqa: E501
        :rtype: Periods
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _from(self) -> str:
        """Gets the _from of this Periods.

        from  # noqa: E501

        :return: The _from of this Periods.
        :rtype: str
        """
        return self.__from

    @_from.setter
    def _from(self, _from: str):
        """Sets the _from of this Periods.

        from  # noqa: E501

        :param _from: The _from of this Periods.
        :type _from: str
        """
        if _from is None:
            raise ValueError("Invalid value for `_from`, must not be `None`")  # noqa: E501

        self.__from = _from

    @property
    def until(self) -> str:
        """Gets the until of this Periods.

        until  # noqa: E501

        :return: The until of this Periods.
        :rtype: str
        """
        return self._until

    @until.setter
    def until(self, until: str):
        """Sets the until of this Periods.

        until  # noqa: E501

        :param until: The until of this Periods.
        :type until: str
        """
        if until is None:
            raise ValueError("Invalid value for `until`, must not be `None`")  # noqa: E501

        self._until = until
