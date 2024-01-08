from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.manager_status import ManagerStatus
from openapi_server.models.node_description import NodeDescription
from openapi_server.models.node_spec import NodeSpec
from openapi_server.models.node_status import NodeStatus
from openapi_server.models.object_version import ObjectVersion
from openapi_server import util

from openapi_server.models.manager_status import ManagerStatus  # noqa: E501
from openapi_server.models.node_description import NodeDescription  # noqa: E501
from openapi_server.models.node_spec import NodeSpec  # noqa: E501
from openapi_server.models.node_status import NodeStatus  # noqa: E501
from openapi_server.models.object_version import ObjectVersion  # noqa: E501

class Node(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_at=None, description=None, id=None, manager_status=None, spec=None, status=None, updated_at=None, version=None):  # noqa: E501
        """Node - a model defined in OpenAPI

        :param created_at: The created_at of this Node.  # noqa: E501
        :type created_at: str
        :param description: The description of this Node.  # noqa: E501
        :type description: NodeDescription
        :param id: The id of this Node.  # noqa: E501
        :type id: str
        :param manager_status: The manager_status of this Node.  # noqa: E501
        :type manager_status: ManagerStatus
        :param spec: The spec of this Node.  # noqa: E501
        :type spec: NodeSpec
        :param status: The status of this Node.  # noqa: E501
        :type status: NodeStatus
        :param updated_at: The updated_at of this Node.  # noqa: E501
        :type updated_at: str
        :param version: The version of this Node.  # noqa: E501
        :type version: ObjectVersion
        """
        self.openapi_types = {
            'created_at': str,
            'description': NodeDescription,
            'id': str,
            'manager_status': ManagerStatus,
            'spec': NodeSpec,
            'status': NodeStatus,
            'updated_at': str,
            'version': ObjectVersion
        }

        self.attribute_map = {
            'created_at': 'CreatedAt',
            'description': 'Description',
            'id': 'ID',
            'manager_status': 'ManagerStatus',
            'spec': 'Spec',
            'status': 'Status',
            'updated_at': 'UpdatedAt',
            'version': 'Version'
        }

        self._created_at = created_at
        self._description = description
        self._id = id
        self._manager_status = manager_status
        self._spec = spec
        self._status = status
        self._updated_at = updated_at
        self._version = version

    @classmethod
    def from_dict(cls, dikt) -> 'Node':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Node of this Node.  # noqa: E501
        :rtype: Node
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_at(self) -> str:
        """Gets the created_at of this Node.

        Date and time at which the node was added to the swarm in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :return: The created_at of this Node.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this Node.

        Date and time at which the node was added to the swarm in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :param created_at: The created_at of this Node.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def description(self) -> NodeDescription:
        """Gets the description of this Node.


        :return: The description of this Node.
        :rtype: NodeDescription
        """
        return self._description

    @description.setter
    def description(self, description: NodeDescription):
        """Sets the description of this Node.


        :param description: The description of this Node.
        :type description: NodeDescription
        """

        self._description = description

    @property
    def id(self) -> str:
        """Gets the id of this Node.


        :return: The id of this Node.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Node.


        :param id: The id of this Node.
        :type id: str
        """

        self._id = id

    @property
    def manager_status(self) -> ManagerStatus:
        """Gets the manager_status of this Node.


        :return: The manager_status of this Node.
        :rtype: ManagerStatus
        """
        return self._manager_status

    @manager_status.setter
    def manager_status(self, manager_status: ManagerStatus):
        """Sets the manager_status of this Node.


        :param manager_status: The manager_status of this Node.
        :type manager_status: ManagerStatus
        """

        self._manager_status = manager_status

    @property
    def spec(self) -> NodeSpec:
        """Gets the spec of this Node.


        :return: The spec of this Node.
        :rtype: NodeSpec
        """
        return self._spec

    @spec.setter
    def spec(self, spec: NodeSpec):
        """Sets the spec of this Node.


        :param spec: The spec of this Node.
        :type spec: NodeSpec
        """

        self._spec = spec

    @property
    def status(self) -> NodeStatus:
        """Gets the status of this Node.


        :return: The status of this Node.
        :rtype: NodeStatus
        """
        return self._status

    @status.setter
    def status(self, status: NodeStatus):
        """Sets the status of this Node.


        :param status: The status of this Node.
        :type status: NodeStatus
        """

        self._status = status

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this Node.

        Date and time at which the node was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :return: The updated_at of this Node.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this Node.

        Date and time at which the node was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :param updated_at: The updated_at of this Node.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def version(self) -> ObjectVersion:
        """Gets the version of this Node.


        :return: The version of this Node.
        :rtype: ObjectVersion
        """
        return self._version

    @version.setter
    def version(self, version: ObjectVersion):
        """Sets the version of this Node.


        :param version: The version of this Node.
        :type version: ObjectVersion
        """

        self._version = version
