from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ProjectCompact(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None):  # noqa: E501
        """ProjectCompact - a model defined in OpenAPI

        :param gid: The gid of this ProjectCompact.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this ProjectCompact.  # noqa: E501
        :type resource_type: str
        :param name: The name of this ProjectCompact.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectCompact':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectCompact of this ProjectCompact.  # noqa: E501
        :rtype: ProjectCompact
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this ProjectCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this ProjectCompact.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this ProjectCompact.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this ProjectCompact.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this ProjectCompact.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this ProjectCompact.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this ProjectCompact.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this ProjectCompact.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this ProjectCompact.

        Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :return: The name of this ProjectCompact.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectCompact.

        Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :param name: The name of this ProjectCompact.
        :type name: str
        """

        self._name = name
