from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class APIKey(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, key=None, name=''):  # noqa: E501
        """APIKey - a model defined in OpenAPI

        :param id: The id of this APIKey.  # noqa: E501
        :type id: str
        :param key: The key of this APIKey.  # noqa: E501
        :type key: str
        :param name: The name of this APIKey.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'id': str,
            'key': str,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'key': 'key',
            'name': 'name'
        }

        self._id = id
        self._key = key
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'APIKey':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The APIKey of this APIKey.  # noqa: E501
        :rtype: APIKey
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this APIKey.

        Object id.  # noqa: E501

        :return: The id of this APIKey.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this APIKey.

        Object id.  # noqa: E501

        :param id: The id of this APIKey.
        :type id: str
        """

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this APIKey.

        Authentication token  # noqa: E501

        :return: The key of this APIKey.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this APIKey.

        Authentication token  # noqa: E501

        :param key: The key of this APIKey.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this APIKey.

        Custom name for the resource  # noqa: E501

        :return: The name of this APIKey.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this APIKey.

        Custom name for the resource  # noqa: E501

        :param name: The name of this APIKey.
        :type name: str
        """

        self._name = name
