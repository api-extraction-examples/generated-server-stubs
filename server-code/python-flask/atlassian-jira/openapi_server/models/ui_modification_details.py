from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.ui_modification_context_details import UiModificationContextDetails
from openapi_server import util

from openapi_server.models.ui_modification_context_details import UiModificationContextDetails  # noqa: E501

class UiModificationDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, contexts=None, data=None, description=None, id=None, name=None, _self=None):  # noqa: E501
        """UiModificationDetails - a model defined in OpenAPI

        :param contexts: The contexts of this UiModificationDetails.  # noqa: E501
        :type contexts: List[UiModificationContextDetails]
        :param data: The data of this UiModificationDetails.  # noqa: E501
        :type data: str
        :param description: The description of this UiModificationDetails.  # noqa: E501
        :type description: str
        :param id: The id of this UiModificationDetails.  # noqa: E501
        :type id: str
        :param name: The name of this UiModificationDetails.  # noqa: E501
        :type name: str
        :param _self: The _self of this UiModificationDetails.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'contexts': List[UiModificationContextDetails],
            'data': str,
            'description': str,
            'id': str,
            'name': str,
            '_self': str
        }

        self.attribute_map = {
            'contexts': 'contexts',
            'data': 'data',
            'description': 'description',
            'id': 'id',
            'name': 'name',
            '_self': 'self'
        }

        self._contexts = contexts
        self._data = data
        self._description = description
        self._id = id
        self._name = name
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'UiModificationDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UiModificationDetails of this UiModificationDetails.  # noqa: E501
        :rtype: UiModificationDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def contexts(self) -> List[UiModificationContextDetails]:
        """Gets the contexts of this UiModificationDetails.

        List of contexts of the UI modification. The maximum number of contexts is 1000.  # noqa: E501

        :return: The contexts of this UiModificationDetails.
        :rtype: List[UiModificationContextDetails]
        """
        return self._contexts

    @contexts.setter
    def contexts(self, contexts: List[UiModificationContextDetails]):
        """Sets the contexts of this UiModificationDetails.

        List of contexts of the UI modification. The maximum number of contexts is 1000.  # noqa: E501

        :param contexts: The contexts of this UiModificationDetails.
        :type contexts: List[UiModificationContextDetails]
        """

        self._contexts = contexts

    @property
    def data(self) -> str:
        """Gets the data of this UiModificationDetails.

        The data of the UI modification. The maximum size of the data is 50000 characters.  # noqa: E501

        :return: The data of this UiModificationDetails.
        :rtype: str
        """
        return self._data

    @data.setter
    def data(self, data: str):
        """Sets the data of this UiModificationDetails.

        The data of the UI modification. The maximum size of the data is 50000 characters.  # noqa: E501

        :param data: The data of this UiModificationDetails.
        :type data: str
        """

        self._data = data

    @property
    def description(self) -> str:
        """Gets the description of this UiModificationDetails.

        The description of the UI modification. The maximum length is 255 characters.  # noqa: E501

        :return: The description of this UiModificationDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UiModificationDetails.

        The description of the UI modification. The maximum length is 255 characters.  # noqa: E501

        :param description: The description of this UiModificationDetails.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> str:
        """Gets the id of this UiModificationDetails.

        The ID of the UI modification.  # noqa: E501

        :return: The id of this UiModificationDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this UiModificationDetails.

        The ID of the UI modification.  # noqa: E501

        :param id: The id of this UiModificationDetails.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this UiModificationDetails.

        The name of the UI modification. The maximum length is 255 characters.  # noqa: E501

        :return: The name of this UiModificationDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UiModificationDetails.

        The name of the UI modification. The maximum length is 255 characters.  # noqa: E501

        :param name: The name of this UiModificationDetails.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this UiModificationDetails.

        The URL of the UI modification.  # noqa: E501

        :return: The _self of this UiModificationDetails.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this UiModificationDetails.

        The URL of the UI modification.  # noqa: E501

        :param _self: The _self of this UiModificationDetails.
        :type _self: str
        """
        if _self is None:
            raise ValueError("Invalid value for `_self`, must not be `None`")  # noqa: E501

        self.__self = _self
