from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.payment_method_data import PaymentMethodData
from openapi_server import util

from openapi_server.models.payment_method_data import PaymentMethodData  # noqa: E501

class PaymentMethod(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_at=None, data=None, id=None, method_name=None, state=None, type=None, updated_at=None):  # noqa: E501
        """PaymentMethod - a model defined in OpenAPI

        :param created_at: The created_at of this PaymentMethod.  # noqa: E501
        :type created_at: str
        :param data: The data of this PaymentMethod.  # noqa: E501
        :type data: PaymentMethodData
        :param id: The id of this PaymentMethod.  # noqa: E501
        :type id: str
        :param method_name: The method_name of this PaymentMethod.  # noqa: E501
        :type method_name: str
        :param state: The state of this PaymentMethod.  # noqa: E501
        :type state: str
        :param type: The type of this PaymentMethod.  # noqa: E501
        :type type: str
        :param updated_at: The updated_at of this PaymentMethod.  # noqa: E501
        :type updated_at: str
        """
        self.openapi_types = {
            'created_at': str,
            'data': PaymentMethodData,
            'id': str,
            'method_name': str,
            'state': str,
            'type': str,
            'updated_at': str
        }

        self.attribute_map = {
            'created_at': 'created_at',
            'data': 'data',
            'id': 'id',
            'method_name': 'method_name',
            'state': 'state',
            'type': 'type',
            'updated_at': 'updated_at'
        }

        self._created_at = created_at
        self._data = data
        self._id = id
        self._method_name = method_name
        self._state = state
        self._type = type
        self._updated_at = updated_at

    @classmethod
    def from_dict(cls, dikt) -> 'PaymentMethod':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The paymentMethod of this PaymentMethod.  # noqa: E501
        :rtype: PaymentMethod
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_at(self) -> str:
        """Gets the created_at of this PaymentMethod.


        :return: The created_at of this PaymentMethod.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this PaymentMethod.


        :param created_at: The created_at of this PaymentMethod.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def data(self) -> PaymentMethodData:
        """Gets the data of this PaymentMethod.


        :return: The data of this PaymentMethod.
        :rtype: PaymentMethodData
        """
        return self._data

    @data.setter
    def data(self, data: PaymentMethodData):
        """Sets the data of this PaymentMethod.


        :param data: The data of this PaymentMethod.
        :type data: PaymentMethodData
        """

        self._data = data

    @property
    def id(self) -> str:
        """Gets the id of this PaymentMethod.


        :return: The id of this PaymentMethod.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PaymentMethod.


        :param id: The id of this PaymentMethod.
        :type id: str
        """

        self._id = id

    @property
    def method_name(self) -> str:
        """Gets the method_name of this PaymentMethod.


        :return: The method_name of this PaymentMethod.
        :rtype: str
        """
        return self._method_name

    @method_name.setter
    def method_name(self, method_name: str):
        """Sets the method_name of this PaymentMethod.


        :param method_name: The method_name of this PaymentMethod.
        :type method_name: str
        """

        self._method_name = method_name

    @property
    def state(self) -> str:
        """Gets the state of this PaymentMethod.


        :return: The state of this PaymentMethod.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this PaymentMethod.


        :param state: The state of this PaymentMethod.
        :type state: str
        """

        self._state = state

    @property
    def type(self) -> str:
        """Gets the type of this PaymentMethod.


        :return: The type of this PaymentMethod.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PaymentMethod.


        :param type: The type of this PaymentMethod.
        :type type: str
        """

        self._type = type

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this PaymentMethod.


        :return: The updated_at of this PaymentMethod.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this PaymentMethod.


        :param updated_at: The updated_at of this PaymentMethod.
        :type updated_at: str
        """

        self._updated_at = updated_at