from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.join_tokens import JoinTokens
from openapi_server.models.object_version import ObjectVersion
from openapi_server.models.swarm_spec import SwarmSpec
from openapi_server.models.tls_info import TLSInfo
from openapi_server import util

from openapi_server.models.join_tokens import JoinTokens  # noqa: E501
from openapi_server.models.object_version import ObjectVersion  # noqa: E501
from openapi_server.models.swarm_spec import SwarmSpec  # noqa: E501
from openapi_server.models.tls_info import TLSInfo  # noqa: E501

class Swarm(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_at=None, id=None, root_rotation_in_progress=None, spec=None, tls_info=None, updated_at=None, version=None, join_tokens=None):  # noqa: E501
        """Swarm - a model defined in OpenAPI

        :param created_at: The created_at of this Swarm.  # noqa: E501
        :type created_at: str
        :param id: The id of this Swarm.  # noqa: E501
        :type id: str
        :param root_rotation_in_progress: The root_rotation_in_progress of this Swarm.  # noqa: E501
        :type root_rotation_in_progress: bool
        :param spec: The spec of this Swarm.  # noqa: E501
        :type spec: SwarmSpec
        :param tls_info: The tls_info of this Swarm.  # noqa: E501
        :type tls_info: TLSInfo
        :param updated_at: The updated_at of this Swarm.  # noqa: E501
        :type updated_at: str
        :param version: The version of this Swarm.  # noqa: E501
        :type version: ObjectVersion
        :param join_tokens: The join_tokens of this Swarm.  # noqa: E501
        :type join_tokens: JoinTokens
        """
        self.openapi_types = {
            'created_at': str,
            'id': str,
            'root_rotation_in_progress': bool,
            'spec': SwarmSpec,
            'tls_info': TLSInfo,
            'updated_at': str,
            'version': ObjectVersion,
            'join_tokens': JoinTokens
        }

        self.attribute_map = {
            'created_at': 'CreatedAt',
            'id': 'ID',
            'root_rotation_in_progress': 'RootRotationInProgress',
            'spec': 'Spec',
            'tls_info': 'TLSInfo',
            'updated_at': 'UpdatedAt',
            'version': 'Version',
            'join_tokens': 'JoinTokens'
        }

        self._created_at = created_at
        self._id = id
        self._root_rotation_in_progress = root_rotation_in_progress
        self._spec = spec
        self._tls_info = tls_info
        self._updated_at = updated_at
        self._version = version
        self._join_tokens = join_tokens

    @classmethod
    def from_dict(cls, dikt) -> 'Swarm':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Swarm of this Swarm.  # noqa: E501
        :rtype: Swarm
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_at(self) -> str:
        """Gets the created_at of this Swarm.

        Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :return: The created_at of this Swarm.
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: str):
        """Sets the created_at of this Swarm.

        Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :param created_at: The created_at of this Swarm.
        :type created_at: str
        """

        self._created_at = created_at

    @property
    def id(self) -> str:
        """Gets the id of this Swarm.

        The ID of the swarm.  # noqa: E501

        :return: The id of this Swarm.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Swarm.

        The ID of the swarm.  # noqa: E501

        :param id: The id of this Swarm.
        :type id: str
        """

        self._id = id

    @property
    def root_rotation_in_progress(self) -> bool:
        """Gets the root_rotation_in_progress of this Swarm.

        Whether there is currently a root CA rotation in progress for the swarm  # noqa: E501

        :return: The root_rotation_in_progress of this Swarm.
        :rtype: bool
        """
        return self._root_rotation_in_progress

    @root_rotation_in_progress.setter
    def root_rotation_in_progress(self, root_rotation_in_progress: bool):
        """Sets the root_rotation_in_progress of this Swarm.

        Whether there is currently a root CA rotation in progress for the swarm  # noqa: E501

        :param root_rotation_in_progress: The root_rotation_in_progress of this Swarm.
        :type root_rotation_in_progress: bool
        """

        self._root_rotation_in_progress = root_rotation_in_progress

    @property
    def spec(self) -> SwarmSpec:
        """Gets the spec of this Swarm.


        :return: The spec of this Swarm.
        :rtype: SwarmSpec
        """
        return self._spec

    @spec.setter
    def spec(self, spec: SwarmSpec):
        """Sets the spec of this Swarm.


        :param spec: The spec of this Swarm.
        :type spec: SwarmSpec
        """

        self._spec = spec

    @property
    def tls_info(self) -> TLSInfo:
        """Gets the tls_info of this Swarm.


        :return: The tls_info of this Swarm.
        :rtype: TLSInfo
        """
        return self._tls_info

    @tls_info.setter
    def tls_info(self, tls_info: TLSInfo):
        """Sets the tls_info of this Swarm.


        :param tls_info: The tls_info of this Swarm.
        :type tls_info: TLSInfo
        """

        self._tls_info = tls_info

    @property
    def updated_at(self) -> str:
        """Gets the updated_at of this Swarm.

        Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :return: The updated_at of this Swarm.
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at: str):
        """Sets the updated_at of this Swarm.

        Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.   # noqa: E501

        :param updated_at: The updated_at of this Swarm.
        :type updated_at: str
        """

        self._updated_at = updated_at

    @property
    def version(self) -> ObjectVersion:
        """Gets the version of this Swarm.


        :return: The version of this Swarm.
        :rtype: ObjectVersion
        """
        return self._version

    @version.setter
    def version(self, version: ObjectVersion):
        """Sets the version of this Swarm.


        :param version: The version of this Swarm.
        :type version: ObjectVersion
        """

        self._version = version

    @property
    def join_tokens(self) -> JoinTokens:
        """Gets the join_tokens of this Swarm.


        :return: The join_tokens of this Swarm.
        :rtype: JoinTokens
        """
        return self._join_tokens

    @join_tokens.setter
    def join_tokens(self, join_tokens: JoinTokens):
        """Sets the join_tokens of this Swarm.


        :param join_tokens: The join_tokens of this Swarm.
        :type join_tokens: JoinTokens
        """

        self._join_tokens = join_tokens