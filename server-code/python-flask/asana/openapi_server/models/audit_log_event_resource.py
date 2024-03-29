from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AuditLogEventResource(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, email=None, gid=None, name=None, resource_subtype=None, resource_type=None):  # noqa: E501
        """AuditLogEventResource - a model defined in OpenAPI

        :param email: The email of this AuditLogEventResource.  # noqa: E501
        :type email: str
        :param gid: The gid of this AuditLogEventResource.  # noqa: E501
        :type gid: str
        :param name: The name of this AuditLogEventResource.  # noqa: E501
        :type name: str
        :param resource_subtype: The resource_subtype of this AuditLogEventResource.  # noqa: E501
        :type resource_subtype: str
        :param resource_type: The resource_type of this AuditLogEventResource.  # noqa: E501
        :type resource_type: str
        """
        self.openapi_types = {
            'email': str,
            'gid': str,
            'name': str,
            'resource_subtype': str,
            'resource_type': str
        }

        self.attribute_map = {
            'email': 'email',
            'gid': 'gid',
            'name': 'name',
            'resource_subtype': 'resource_subtype',
            'resource_type': 'resource_type'
        }

        self._email = email
        self._gid = gid
        self._name = name
        self._resource_subtype = resource_subtype
        self._resource_type = resource_type

    @classmethod
    def from_dict(cls, dikt) -> 'AuditLogEventResource':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AuditLogEventResource of this AuditLogEventResource.  # noqa: E501
        :rtype: AuditLogEventResource
        """
        return util.deserialize_model(dikt, cls)

    @property
    def email(self) -> str:
        """Gets the email of this AuditLogEventResource.

        The email of the resource, if applicable.  # noqa: E501

        :return: The email of this AuditLogEventResource.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email: str):
        """Sets the email of this AuditLogEventResource.

        The email of the resource, if applicable.  # noqa: E501

        :param email: The email of this AuditLogEventResource.
        :type email: str
        """

        self._email = email

    @property
    def gid(self) -> str:
        """Gets the gid of this AuditLogEventResource.

        Globally unique identifier of the resource.  # noqa: E501

        :return: The gid of this AuditLogEventResource.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this AuditLogEventResource.

        Globally unique identifier of the resource.  # noqa: E501

        :param gid: The gid of this AuditLogEventResource.
        :type gid: str
        """

        self._gid = gid

    @property
    def name(self) -> str:
        """Gets the name of this AuditLogEventResource.

        The name of the resource.  # noqa: E501

        :return: The name of this AuditLogEventResource.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this AuditLogEventResource.

        The name of the resource.  # noqa: E501

        :param name: The name of this AuditLogEventResource.
        :type name: str
        """

        self._name = name

    @property
    def resource_subtype(self) -> str:
        """Gets the resource_subtype of this AuditLogEventResource.

        The subtype of resource. Most resources will not have a subtype.  # noqa: E501

        :return: The resource_subtype of this AuditLogEventResource.
        :rtype: str
        """
        return self._resource_subtype

    @resource_subtype.setter
    def resource_subtype(self, resource_subtype: str):
        """Sets the resource_subtype of this AuditLogEventResource.

        The subtype of resource. Most resources will not have a subtype.  # noqa: E501

        :param resource_subtype: The resource_subtype of this AuditLogEventResource.
        :type resource_subtype: str
        """

        self._resource_subtype = resource_subtype

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this AuditLogEventResource.

        The type of resource.  # noqa: E501

        :return: The resource_type of this AuditLogEventResource.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this AuditLogEventResource.

        The type of resource.  # noqa: E501

        :param resource_type: The resource_type of this AuditLogEventResource.
        :type resource_type: str
        """

        self._resource_type = resource_type
