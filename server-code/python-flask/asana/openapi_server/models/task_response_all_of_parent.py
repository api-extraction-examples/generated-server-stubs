from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskResponseAllOfParent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, resource_subtype=None):  # noqa: E501
        """TaskResponseAllOfParent - a model defined in OpenAPI

        :param gid: The gid of this TaskResponseAllOfParent.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this TaskResponseAllOfParent.  # noqa: E501
        :type resource_type: str
        :param name: The name of this TaskResponseAllOfParent.  # noqa: E501
        :type name: str
        :param resource_subtype: The resource_subtype of this TaskResponseAllOfParent.  # noqa: E501
        :type resource_subtype: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'resource_subtype': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'resource_subtype': 'resource_subtype'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._resource_subtype = resource_subtype

    @classmethod
    def from_dict(cls, dikt) -> 'TaskResponseAllOfParent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskResponse_allOf_parent of this TaskResponseAllOfParent.  # noqa: E501
        :rtype: TaskResponseAllOfParent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this TaskResponseAllOfParent.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this TaskResponseAllOfParent.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this TaskResponseAllOfParent.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this TaskResponseAllOfParent.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this TaskResponseAllOfParent.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this TaskResponseAllOfParent.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this TaskResponseAllOfParent.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this TaskResponseAllOfParent.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this TaskResponseAllOfParent.

        The name of the task.  # noqa: E501

        :return: The name of this TaskResponseAllOfParent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TaskResponseAllOfParent.

        The name of the task.  # noqa: E501

        :param name: The name of this TaskResponseAllOfParent.
        :type name: str
        """

        self._name = name

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this TaskResponseAllOfParent.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.  # noqa: E501

        :return: The resource_subtype of this TaskResponseAllOfParent.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this TaskResponseAllOfParent.

        The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.  # noqa: E501

        :param resource_subtype: The resource_subtype of this TaskResponseAllOfParent.
        :type resource_subtype: str
        """
        allowed_values = ["default_task", "milestone", "section", "approval"]  # noqa: E501
        if resource_subtype not in allowed_values:
            raise ValueError(
                "Invalid value for `resource_subtype` ({0}), must be one of {1}"
                .format(resource_subtype, allowed_values)
            )

        self._resource_subtype = resource_subtype
