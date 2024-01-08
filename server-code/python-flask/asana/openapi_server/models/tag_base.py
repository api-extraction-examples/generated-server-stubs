from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TagBase(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, color=None, notes=None):  # noqa: E501
        """TagBase - a model defined in OpenAPI

        :param gid: The gid of this TagBase.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this TagBase.  # noqa: E501
        :type resource_type: str
        :param name: The name of this TagBase.  # noqa: E501
        :type name: str
        :param color: The color of this TagBase.  # noqa: E501
        :type color: str
        :param notes: The notes of this TagBase.  # noqa: E501
        :type notes: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'color': str,
            'notes': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'color': 'color',
            'notes': 'notes'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._color = color
        self._notes = notes

    @classmethod
    def from_dict(cls, dikt) -> 'TagBase':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagBase of this TagBase.  # noqa: E501
        :rtype: TagBase
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this TagBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this TagBase.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this TagBase.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this TagBase.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this TagBase.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this TagBase.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this TagBase.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this TagBase.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this TagBase.

        Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :return: The name of this TagBase.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TagBase.

        Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :param name: The name of this TagBase.
        :type name: str
        """

        self._name = name

    @property
    def color(self) -> str:
        """Gets the color of this TagBase.

        Color of the tag.  # noqa: E501

        :return: The color of this TagBase.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this TagBase.

        Color of the tag.  # noqa: E501

        :param color: The color of this TagBase.
        :type color: str
        """
        allowed_values = [None,"dark-pink", "dark-green", "dark-blue", "dark-red", "dark-teal", "dark-brown", "dark-orange", "dark-purple", "dark-warm-gray", "light-pink", "light-green", "light-blue", "light-red", "light-teal", "light-brown", "light-orange", "light-purple", "light-warm-gray"]  # noqa: E501
        if color not in allowed_values:
            raise ValueError(
                "Invalid value for `color` ({0}), must be one of {1}"
                .format(color, allowed_values)
            )

        self._color = color

    @property
    def notes(self) -> str:
        """Gets the notes of this TagBase.

        Free-form textual information associated with the tag (i.e. its description).  # noqa: E501

        :return: The notes of this TagBase.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this TagBase.

        Free-form textual information associated with the tag (i.e. its description).  # noqa: E501

        :param notes: The notes of this TagBase.
        :type notes: str
        """

        self._notes = notes
