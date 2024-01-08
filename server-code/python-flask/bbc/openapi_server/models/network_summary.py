from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.network_titles import NetworkTitles
from openapi_server import util

from openapi_server.models.network_titles import NetworkTitles  # noqa: E501

class NetworkSummary(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, active=None, group=None, id=None, key=None, titles=None, type=None):  # noqa: E501
        """NetworkSummary - a model defined in OpenAPI

        :param active: The active of this NetworkSummary.  # noqa: E501
        :type active: bool
        :param group: The group of this NetworkSummary.  # noqa: E501
        :type group: str
        :param id: The id of this NetworkSummary.  # noqa: E501
        :type id: str
        :param key: The key of this NetworkSummary.  # noqa: E501
        :type key: str
        :param titles: The titles of this NetworkSummary.  # noqa: E501
        :type titles: NetworkTitles
        :param type: The type of this NetworkSummary.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'active': bool,
            'group': str,
            'id': str,
            'key': str,
            'titles': NetworkTitles,
            'type': str
        }

        self.attribute_map = {
            'active': 'active',
            'group': 'group',
            'id': 'id',
            'key': 'key',
            'titles': 'titles',
            'type': 'type'
        }

        self._active = active
        self._group = group
        self._id = id
        self._key = key
        self._titles = titles
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'NetworkSummary':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NetworkSummary of this NetworkSummary.  # noqa: E501
        :rtype: NetworkSummary
        """
        return util.deserialize_model(dikt, cls)

    @property
    def active(self) -> bool:
        """Gets the active of this NetworkSummary.


        :return: The active of this NetworkSummary.
        :rtype: bool
        """
        return self._active

    @active.setter
    def active(self, active: bool):
        """Sets the active of this NetworkSummary.


        :param active: The active of this NetworkSummary.
        :type active: bool
        """
        if active is None:
            raise ValueError("Invalid value for `active`, must not be `None`")  # noqa: E501

        self._active = active

    @property
    def group(self) -> str:
        """Gets the group of this NetworkSummary.


        :return: The group of this NetworkSummary.
        :rtype: str
        """
        return self._group

    @group.setter
    def group(self, group: str):
        """Sets the group of this NetworkSummary.


        :param group: The group of this NetworkSummary.
        :type group: str
        """
        if group is None:
            raise ValueError("Invalid value for `group`, must not be `None`")  # noqa: E501

        self._group = group

    @property
    def id(self) -> str:
        """Gets the id of this NetworkSummary.


        :return: The id of this NetworkSummary.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this NetworkSummary.


        :param id: The id of this NetworkSummary.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def key(self) -> str:
        """Gets the key of this NetworkSummary.


        :return: The key of this NetworkSummary.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this NetworkSummary.


        :param key: The key of this NetworkSummary.
        :type key: str
        """
        if key is None:
            raise ValueError("Invalid value for `key`, must not be `None`")  # noqa: E501

        self._key = key

    @property
    def titles(self) -> NetworkTitles:
        """Gets the titles of this NetworkSummary.


        :return: The titles of this NetworkSummary.
        :rtype: NetworkTitles
        """
        return self._titles

    @titles.setter
    def titles(self, titles: NetworkTitles):
        """Sets the titles of this NetworkSummary.


        :param titles: The titles of this NetworkSummary.
        :type titles: NetworkTitles
        """
        if titles is None:
            raise ValueError("Invalid value for `titles`, must not be `None`")  # noqa: E501

        self._titles = titles

    @property
    def type(self) -> str:
        """Gets the type of this NetworkSummary.


        :return: The type of this NetworkSummary.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this NetworkSummary.


        :param type: The type of this NetworkSummary.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type
