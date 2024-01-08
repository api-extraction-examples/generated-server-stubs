from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_compact import UserCompact
from openapi_server.models.workspace_compact import WorkspaceCompact
from openapi_server import util

from openapi_server.models.user_compact import UserCompact  # noqa: E501
from openapi_server.models.workspace_compact import WorkspaceCompact  # noqa: E501

class TagResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, color=None, notes=None, created_at=None, followers=None, permalink_url=None, workspace=None):  # noqa: E501
        """TagResponse - a model defined in OpenAPI

        :param gid: The gid of this TagResponse.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this TagResponse.  # noqa: E501
        :type resource_type: str
        :param name: The name of this TagResponse.  # noqa: E501
        :type name: str
        :param color: The color of this TagResponse.  # noqa: E501
        :type color: str
        :param notes: The notes of this TagResponse.  # noqa: E501
        :type notes: str
        :param created_at: The created_at of this TagResponse.  # noqa: E501
        :type created_at: datetime
        :param followers: The followers of this TagResponse.  # noqa: E501
        :type followers: List[UserCompact]
        :param permalink_url: The permalink_url of this TagResponse.  # noqa: E501
        :type permalink_url: str
        :param workspace: The workspace of this TagResponse.  # noqa: E501
        :type workspace: WorkspaceCompact
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'color': str,
            'notes': str,
            'created_at': datetime,
            'followers': List[UserCompact],
            'permalink_url': str,
            'workspace': WorkspaceCompact
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'color': 'color',
            'notes': 'notes',
            'created_at': 'created_at',
            'followers': 'followers',
            'permalink_url': 'permalink_url',
            'workspace': 'workspace'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._color = color
        self._notes = notes
        self._created_at = created_at
        self._followers = followers
        self._permalink_url = permalink_url
        self._workspace = workspace

    @classmethod
    def from_dict(cls, dikt) -> 'TagResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TagResponse of this TagResponse.  # noqa: E501
        :rtype: TagResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this TagResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this TagResponse.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this TagResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this TagResponse.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this TagResponse.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this TagResponse.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this TagResponse.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this TagResponse.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this TagResponse.

        Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :return: The name of this TagResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TagResponse.

        Name of the tag. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.  # noqa: E501

        :param name: The name of this TagResponse.
        :type name: str
        """

        self._name = name

    @property
    def color(self) -> str:
        """Gets the color of this TagResponse.

        Color of the tag.  # noqa: E501

        :return: The color of this TagResponse.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this TagResponse.

        Color of the tag.  # noqa: E501

        :param color: The color of this TagResponse.
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
        """Gets the notes of this TagResponse.

        Free-form textual information associated with the tag (i.e. its description).  # noqa: E501

        :return: The notes of this TagResponse.
        :rtype: str
        """
        return self._notes

    @notes.setter
    def notes(self, notes: str):
        """Sets the notes of this TagResponse.

        Free-form textual information associated with the tag (i.e. its description).  # noqa: E501

        :param notes: The notes of this TagResponse.
        :type notes: str
        """

        self._notes = notes

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this TagResponse.

        The time at which this resource was created.  # noqa: E501

        :return: The created_at of this TagResponse.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this TagResponse.

        The time at which this resource was created.  # noqa: E501

        :param created_at: The created_at of this TagResponse.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def followers(self) -> List[UserCompact]:
        """Gets the followers of this TagResponse.

        Array of users following this tag.  # noqa: E501

        :return: The followers of this TagResponse.
        :rtype: List[UserCompact]
        """
        return self._followers

    @followers.setter
    def followers(self, followers: List[UserCompact]):
        """Sets the followers of this TagResponse.

        Array of users following this tag.  # noqa: E501

        :param followers: The followers of this TagResponse.
        :type followers: List[UserCompact]
        """

        self._followers = followers

    @property
    def permalink_url(self) -> str:
        """Gets the permalink_url of this TagResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :return: The permalink_url of this TagResponse.
        :rtype: str
        """
        return self._permalink_url

    @permalink_url.setter
    def permalink_url(self, permalink_url: str):
        """Sets the permalink_url of this TagResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :param permalink_url: The permalink_url of this TagResponse.
        :type permalink_url: str
        """

        self._permalink_url = permalink_url

    @property
    def workspace(self) -> WorkspaceCompact:
        """Gets the workspace of this TagResponse.


        :return: The workspace of this TagResponse.
        :rtype: WorkspaceCompact
        """
        return self._workspace

    @workspace.setter
    def workspace(self, workspace: WorkspaceCompact):
        """Sets the workspace of this TagResponse.


        :param workspace: The workspace of this TagResponse.
        :type workspace: WorkspaceCompact
        """

        self._workspace = workspace