from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CustomFieldContextDefaultValueDate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _date=None, type=None, use_current=False):  # noqa: E501
        """CustomFieldContextDefaultValueDate - a model defined in OpenAPI

        :param _date: The _date of this CustomFieldContextDefaultValueDate.  # noqa: E501
        :type _date: str
        :param type: The type of this CustomFieldContextDefaultValueDate.  # noqa: E501
        :type type: str
        :param use_current: The use_current of this CustomFieldContextDefaultValueDate.  # noqa: E501
        :type use_current: bool
        """
        self.openapi_types = {
            '_date': str,
            'type': str,
            'use_current': bool
        }

        self.attribute_map = {
            '_date': 'date',
            'type': 'type',
            'use_current': 'useCurrent'
        }

        self.__date = _date
        self._type = type
        self._use_current = use_current

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldContextDefaultValueDate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldContextDefaultValueDate of this CustomFieldContextDefaultValueDate.  # noqa: E501
        :rtype: CustomFieldContextDefaultValueDate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _date(self) -> str:
        """Gets the _date of this CustomFieldContextDefaultValueDate.

        The default date in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :return: The _date of this CustomFieldContextDefaultValueDate.
        :rtype: str
        """
        return self.__date

    @_date.setter
    def _date(self, _date: str):
        """Sets the _date of this CustomFieldContextDefaultValueDate.

        The default date in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :param _date: The _date of this CustomFieldContextDefaultValueDate.
        :type _date: str
        """

        self.__date = _date

    @property
    def type(self) -> str:
        """Gets the type of this CustomFieldContextDefaultValueDate.


        :return: The type of this CustomFieldContextDefaultValueDate.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CustomFieldContextDefaultValueDate.


        :param type: The type of this CustomFieldContextDefaultValueDate.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def use_current(self) -> bool:
        """Gets the use_current of this CustomFieldContextDefaultValueDate.

        Whether to use the current date.  # noqa: E501

        :return: The use_current of this CustomFieldContextDefaultValueDate.
        :rtype: bool
        """
        return self._use_current

    @use_current.setter
    def use_current(self, use_current: bool):
        """Sets the use_current of this CustomFieldContextDefaultValueDate.

        Whether to use the current date.  # noqa: E501

        :param use_current: The use_current of this CustomFieldContextDefaultValueDate.
        :type use_current: bool
        """

        self._use_current = use_current
