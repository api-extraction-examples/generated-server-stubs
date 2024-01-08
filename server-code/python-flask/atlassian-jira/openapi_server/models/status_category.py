from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class StatusCategory(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, color_name=None, id=None, key=None, name=None, _self=None):  # noqa: E501
        """StatusCategory - a model defined in OpenAPI

        :param color_name: The color_name of this StatusCategory.  # noqa: E501
        :type color_name: str
        :param id: The id of this StatusCategory.  # noqa: E501
        :type id: int
        :param key: The key of this StatusCategory.  # noqa: E501
        :type key: str
        :param name: The name of this StatusCategory.  # noqa: E501
        :type name: str
        :param _self: The _self of this StatusCategory.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'color_name': str,
            'id': int,
            'key': str,
            'name': str,
            '_self': str
        }

        self.attribute_map = {
            'color_name': 'colorName',
            'id': 'id',
            'key': 'key',
            'name': 'name',
            '_self': 'self'
        }

        self._color_name = color_name
        self._id = id
        self._key = key
        self._name = name
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'StatusCategory':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StatusCategory of this StatusCategory.  # noqa: E501
        :rtype: StatusCategory
        """
        return util.deserialize_model(dikt, cls)

    @property
    def color_name(self) -> str:
        """Gets the color_name of this StatusCategory.

        The name of the color used to represent the status category.  # noqa: E501

        :return: The color_name of this StatusCategory.
        :rtype: str
        """
        return self._color_name

    @color_name.setter
    def color_name(self, color_name: str):
        """Sets the color_name of this StatusCategory.

        The name of the color used to represent the status category.  # noqa: E501

        :param color_name: The color_name of this StatusCategory.
        :type color_name: str
        """

        self._color_name = color_name

    @property
    def id(self) -> int:
        """Gets the id of this StatusCategory.

        The ID of the status category.  # noqa: E501

        :return: The id of this StatusCategory.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this StatusCategory.

        The ID of the status category.  # noqa: E501

        :param id: The id of this StatusCategory.
        :type id: int
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this StatusCategory.

        The key of the status category.  # noqa: E501

        :return: The key of this StatusCategory.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this StatusCategory.

        The key of the status category.  # noqa: E501

        :param key: The key of this StatusCategory.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this StatusCategory.

        The name of the status category.  # noqa: E501

        :return: The name of this StatusCategory.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this StatusCategory.

        The name of the status category.  # noqa: E501

        :param name: The name of this StatusCategory.
        :type name: str
        """

        self._name = name

    @property
    def _self(self) -> str:
        """Gets the _self of this StatusCategory.

        The URL of the status category.  # noqa: E501

        :return: The _self of this StatusCategory.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this StatusCategory.

        The URL of the status category.  # noqa: E501

        :param _self: The _self of this StatusCategory.
        :type _self: str
        """

        self.__self = _self
