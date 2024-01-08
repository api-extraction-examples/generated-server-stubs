from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.application import Application
from openapi_server.models.remote_object import RemoteObject
from openapi_server import util

from openapi_server.models.application import Application  # noqa: E501
from openapi_server.models.remote_object import RemoteObject  # noqa: E501

class RemoteIssueLink(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, application=None, global_id=None, id=None, object=None, relationship=None, _self=None):  # noqa: E501
        """RemoteIssueLink - a model defined in OpenAPI

        :param application: The application of this RemoteIssueLink.  # noqa: E501
        :type application: Application
        :param global_id: The global_id of this RemoteIssueLink.  # noqa: E501
        :type global_id: str
        :param id: The id of this RemoteIssueLink.  # noqa: E501
        :type id: int
        :param object: The object of this RemoteIssueLink.  # noqa: E501
        :type object: RemoteObject
        :param relationship: The relationship of this RemoteIssueLink.  # noqa: E501
        :type relationship: str
        :param _self: The _self of this RemoteIssueLink.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'application': Application,
            'global_id': str,
            'id': int,
            'object': RemoteObject,
            'relationship': str,
            '_self': str
        }

        self.attribute_map = {
            'application': 'application',
            'global_id': 'globalId',
            'id': 'id',
            'object': 'object',
            'relationship': 'relationship',
            '_self': 'self'
        }

        self._application = application
        self._global_id = global_id
        self._id = id
        self._object = object
        self._relationship = relationship
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'RemoteIssueLink':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RemoteIssueLink of this RemoteIssueLink.  # noqa: E501
        :rtype: RemoteIssueLink
        """
        return util.deserialize_model(dikt, cls)

    @property
    def application(self) -> Application:
        """Gets the application of this RemoteIssueLink.


        :return: The application of this RemoteIssueLink.
        :rtype: Application
        """
        return self._application

    @application.setter
    def application(self, application: Application):
        """Sets the application of this RemoteIssueLink.


        :param application: The application of this RemoteIssueLink.
        :type application: Application
        """

        self._application = application

    @property
    def global_id(self) -> str:
        """Gets the global_id of this RemoteIssueLink.

        The global ID of the link, such as the ID of the item on the remote system.  # noqa: E501

        :return: The global_id of this RemoteIssueLink.
        :rtype: str
        """
        return self._global_id

    @global_id.setter
    def global_id(self, global_id: str):
        """Sets the global_id of this RemoteIssueLink.

        The global ID of the link, such as the ID of the item on the remote system.  # noqa: E501

        :param global_id: The global_id of this RemoteIssueLink.
        :type global_id: str
        """

        self._global_id = global_id

    @property
    def id(self) -> int:
        """Gets the id of this RemoteIssueLink.

        The ID of the link.  # noqa: E501

        :return: The id of this RemoteIssueLink.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this RemoteIssueLink.

        The ID of the link.  # noqa: E501

        :param id: The id of this RemoteIssueLink.
        :type id: int
        """

        self._id = id

    @property
    def object(self) -> RemoteObject:
        """Gets the object of this RemoteIssueLink.


        :return: The object of this RemoteIssueLink.
        :rtype: RemoteObject
        """
        return self._object

    @object.setter
    def object(self, object: RemoteObject):
        """Sets the object of this RemoteIssueLink.


        :param object: The object of this RemoteIssueLink.
        :type object: RemoteObject
        """

        self._object = object

    @property
    def relationship(self) -> str:
        """Gets the relationship of this RemoteIssueLink.

        Description of the relationship between the issue and the linked item.  # noqa: E501

        :return: The relationship of this RemoteIssueLink.
        :rtype: str
        """
        return self._relationship

    @relationship.setter
    def relationship(self, relationship: str):
        """Sets the relationship of this RemoteIssueLink.

        Description of the relationship between the issue and the linked item.  # noqa: E501

        :param relationship: The relationship of this RemoteIssueLink.
        :type relationship: str
        """

        self._relationship = relationship

    @property
    def _self(self) -> str:
        """Gets the _self of this RemoteIssueLink.

        The URL of the link.  # noqa: E501

        :return: The _self of this RemoteIssueLink.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this RemoteIssueLink.

        The URL of the link.  # noqa: E501

        :param _self: The _self of this RemoteIssueLink.
        :type _self: str
        """

        self.__self = _self