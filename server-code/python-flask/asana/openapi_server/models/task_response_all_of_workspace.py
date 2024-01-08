from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskResponseAllOfWorkspace(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None):  # noqa: E501
        """TaskResponseAllOfWorkspace - a model defined in OpenAPI

        :param gid: The gid of this TaskResponseAllOfWorkspace.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this TaskResponseAllOfWorkspace.  # noqa: E501
        :type resource_type: str
        :param name: The name of this TaskResponseAllOfWorkspace.  # noqa: E501
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
    def from_dict(cls, dikt) -> 'TaskResponseAllOfWorkspace':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskResponse_allOf_workspace of this TaskResponseAllOfWorkspace.  # noqa: E501
        :rtype: TaskResponseAllOfWorkspace
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this TaskResponseAllOfWorkspace.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this TaskResponseAllOfWorkspace.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this TaskResponseAllOfWorkspace.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this TaskResponseAllOfWorkspace.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this TaskResponseAllOfWorkspace.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this TaskResponseAllOfWorkspace.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this TaskResponseAllOfWorkspace.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this TaskResponseAllOfWorkspace.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this TaskResponseAllOfWorkspace.

        The name of the workspace.  # noqa: E501

        :return: The name of this TaskResponseAllOfWorkspace.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TaskResponseAllOfWorkspace.

        The name of the workspace.  # noqa: E501

        :param name: The name of this TaskResponseAllOfWorkspace.
        :type name: str
        """

        self._name = name
