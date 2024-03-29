from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class History(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, accounts=None, day=None, uses=None):  # noqa: E501
        """History - a model defined in OpenAPI

        :param accounts: The accounts of this History.  # noqa: E501
        :type accounts: str
        :param day: The day of this History.  # noqa: E501
        :type day: str
        :param uses: The uses of this History.  # noqa: E501
        :type uses: str
        """
        self.openapi_types = {
            'accounts': str,
            'day': str,
            'uses': str
        }

        self.attribute_map = {
            'accounts': 'accounts',
            'day': 'day',
            'uses': 'uses'
        }

        self._accounts = accounts
        self._day = day
        self._uses = uses

    @classmethod
    def from_dict(cls, dikt) -> 'History':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The History of this History.  # noqa: E501
        :rtype: History
        """
        return util.deserialize_model(dikt, cls)

    @property
    def accounts(self) -> str:
        """Gets the accounts of this History.

        the total of accounts using the tag within that day. Cast from an integer.  # noqa: E501

        :return: The accounts of this History.
        :rtype: str
        """
        return self._accounts

    @accounts.setter
    def accounts(self, accounts: str):
        """Sets the accounts of this History.

        the total of accounts using the tag within that day. Cast from an integer.  # noqa: E501

        :param accounts: The accounts of this History.
        :type accounts: str
        """
        if accounts is None:
            raise ValueError("Invalid value for `accounts`, must not be `None`")  # noqa: E501

        self._accounts = accounts

    @property
    def day(self) -> str:
        """Gets the day of this History.

        UNIX timestamp on midnight of the given day.  # noqa: E501

        :return: The day of this History.
        :rtype: str
        """
        return self._day

    @day.setter
    def day(self, day: str):
        """Sets the day of this History.

        UNIX timestamp on midnight of the given day.  # noqa: E501

        :param day: The day of this History.
        :type day: str
        """
        if day is None:
            raise ValueError("Invalid value for `day`, must not be `None`")  # noqa: E501

        self._day = day

    @property
    def uses(self) -> str:
        """Gets the uses of this History.

        the counted usage of the tag within that day. Cast from an integer.  # noqa: E501

        :return: The uses of this History.
        :rtype: str
        """
        return self._uses

    @uses.setter
    def uses(self, uses: str):
        """Sets the uses of this History.

        the counted usage of the tag within that day. Cast from an integer.  # noqa: E501

        :param uses: The uses of this History.
        :type uses: str
        """
        if uses is None:
            raise ValueError("Invalid value for `uses`, must not be `None`")  # noqa: E501

        self._uses = uses
