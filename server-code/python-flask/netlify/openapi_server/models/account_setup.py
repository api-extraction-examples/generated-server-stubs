from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AccountSetup(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, extra_seats_block=None, name=None, payment_method_id=None, period=None, type_id=None):  # noqa: E501
        """AccountSetup - a model defined in OpenAPI

        :param extra_seats_block: The extra_seats_block of this AccountSetup.  # noqa: E501
        :type extra_seats_block: int
        :param name: The name of this AccountSetup.  # noqa: E501
        :type name: str
        :param payment_method_id: The payment_method_id of this AccountSetup.  # noqa: E501
        :type payment_method_id: str
        :param period: The period of this AccountSetup.  # noqa: E501
        :type period: str
        :param type_id: The type_id of this AccountSetup.  # noqa: E501
        :type type_id: str
        """
        self.openapi_types = {
            'extra_seats_block': int,
            'name': str,
            'payment_method_id': str,
            'period': str,
            'type_id': str
        }

        self.attribute_map = {
            'extra_seats_block': 'extra_seats_block',
            'name': 'name',
            'payment_method_id': 'payment_method_id',
            'period': 'period',
            'type_id': 'type_id'
        }

        self._extra_seats_block = extra_seats_block
        self._name = name
        self._payment_method_id = payment_method_id
        self._period = period
        self._type_id = type_id

    @classmethod
    def from_dict(cls, dikt) -> 'AccountSetup':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The accountSetup of this AccountSetup.  # noqa: E501
        :rtype: AccountSetup
        """
        return util.deserialize_model(dikt, cls)

    @property
    def extra_seats_block(self) -> int:
        """Gets the extra_seats_block of this AccountSetup.


        :return: The extra_seats_block of this AccountSetup.
        :rtype: int
        """
        return self._extra_seats_block

    @extra_seats_block.setter
    def extra_seats_block(self, extra_seats_block: int):
        """Sets the extra_seats_block of this AccountSetup.


        :param extra_seats_block: The extra_seats_block of this AccountSetup.
        :type extra_seats_block: int
        """

        self._extra_seats_block = extra_seats_block

    @property
    def name(self) -> str:
        """Gets the name of this AccountSetup.


        :return: The name of this AccountSetup.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AccountSetup.


        :param name: The name of this AccountSetup.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def payment_method_id(self) -> str:
        """Gets the payment_method_id of this AccountSetup.


        :return: The payment_method_id of this AccountSetup.
        :rtype: str
        """
        return self._payment_method_id

    @payment_method_id.setter
    def payment_method_id(self, payment_method_id: str):
        """Sets the payment_method_id of this AccountSetup.


        :param payment_method_id: The payment_method_id of this AccountSetup.
        :type payment_method_id: str
        """

        self._payment_method_id = payment_method_id

    @property
    def period(self) -> str:
        """Gets the period of this AccountSetup.


        :return: The period of this AccountSetup.
        :rtype: str
        """
        return self._period

    @period.setter
    def period(self, period: str):
        """Sets the period of this AccountSetup.


        :param period: The period of this AccountSetup.
        :type period: str
        """
        allowed_values = ["monthly", "yearly"]  # noqa: E501
        if period not in allowed_values:
            raise ValueError(
                "Invalid value for `period` ({0}), must be one of {1}"
                .format(period, allowed_values)
            )

        self._period = period

    @property
    def type_id(self) -> str:
        """Gets the type_id of this AccountSetup.


        :return: The type_id of this AccountSetup.
        :rtype: str
        """
        return self._type_id

    @type_id.setter
    def type_id(self, type_id: str):
        """Sets the type_id of this AccountSetup.


        :param type_id: The type_id of this AccountSetup.
        :type type_id: str
        """
        if type_id is None:
            raise ValueError("Invalid value for `type_id`, must not be `None`")  # noqa: E501

        self._type_id = type_id
