from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.client_side_availability import ClientSideAvailability
from openapi_server.models.environment import Environment
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.client_side_availability import ClientSideAvailability  # noqa: E501
from openapi_server.models.environment import Environment  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class Project(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, links=None, default_client_side_availability=None, environments=None, include_in_snippet_by_default=None, key=None, name=None, tags=None):  # noqa: E501
        """Project - a model defined in OpenAPI

        :param id: The id of this Project.  # noqa: E501
        :type id: str
        :param links: The links of this Project.  # noqa: E501
        :type links: Links
        :param default_client_side_availability: The default_client_side_availability of this Project.  # noqa: E501
        :type default_client_side_availability: ClientSideAvailability
        :param environments: The environments of this Project.  # noqa: E501
        :type environments: List[Environment]
        :param include_in_snippet_by_default: The include_in_snippet_by_default of this Project.  # noqa: E501
        :type include_in_snippet_by_default: bool
        :param key: The key of this Project.  # noqa: E501
        :type key: str
        :param name: The name of this Project.  # noqa: E501
        :type name: str
        :param tags: The tags of this Project.  # noqa: E501
        :type tags: List[str]
        """
        self.openapi_types = {
            'id': str,
            'links': Links,
            'default_client_side_availability': ClientSideAvailability,
            'environments': List[Environment],
            'include_in_snippet_by_default': bool,
            'key': str,
            'name': str,
            'tags': List[str]
        }

        self.attribute_map = {
            'id': '_id',
            'links': '_links',
            'default_client_side_availability': 'defaultClientSideAvailability',
            'environments': 'environments',
            'include_in_snippet_by_default': 'includeInSnippetByDefault',
            'key': 'key',
            'name': 'name',
            'tags': 'tags'
        }

        self._id = id
        self._links = links
        self._default_client_side_availability = default_client_side_availability
        self._environments = environments
        self._include_in_snippet_by_default = include_in_snippet_by_default
        self._key = key
        self._name = name
        self._tags = tags

    @classmethod
    def from_dict(cls, dikt) -> 'Project':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Project of this Project.  # noqa: E501
        :rtype: Project
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this Project.

        The unique resource id.  # noqa: E501

        :return: The id of this Project.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Project.

        The unique resource id.  # noqa: E501

        :param id: The id of this Project.
        :type id: str
        """

        self._id = id

    @property
    def links(self) -> Links:
        """Gets the links of this Project.


        :return: The links of this Project.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this Project.


        :param links: The links of this Project.
        :type links: Links
        """

        self._links = links

    @property
    def default_client_side_availability(self) -> ClientSideAvailability:
        """Gets the default_client_side_availability of this Project.


        :return: The default_client_side_availability of this Project.
        :rtype: ClientSideAvailability
        """
        return self._default_client_side_availability

    @default_client_side_availability.setter
    def default_client_side_availability(self, default_client_side_availability: ClientSideAvailability):
        """Sets the default_client_side_availability of this Project.


        :param default_client_side_availability: The default_client_side_availability of this Project.
        :type default_client_side_availability: ClientSideAvailability
        """

        self._default_client_side_availability = default_client_side_availability

    @property
    def environments(self) -> List[Environment]:
        """Gets the environments of this Project.


        :return: The environments of this Project.
        :rtype: List[Environment]
        """
        return self._environments

    @environments.setter
    def environments(self, environments: List[Environment]):
        """Sets the environments of this Project.


        :param environments: The environments of this Project.
        :type environments: List[Environment]
        """

        self._environments = environments

    @property
    def include_in_snippet_by_default(self) -> bool:
        """Gets the include_in_snippet_by_default of this Project.


        :return: The include_in_snippet_by_default of this Project.
        :rtype: bool
        """
        return self._include_in_snippet_by_default

    @include_in_snippet_by_default.setter
    def include_in_snippet_by_default(self, include_in_snippet_by_default: bool):
        """Sets the include_in_snippet_by_default of this Project.


        :param include_in_snippet_by_default: The include_in_snippet_by_default of this Project.
        :type include_in_snippet_by_default: bool
        """

        self._include_in_snippet_by_default = include_in_snippet_by_default

    @property
    def key(self) -> str:
        """Gets the key of this Project.


        :return: The key of this Project.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this Project.


        :param key: The key of this Project.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this Project.


        :return: The name of this Project.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Project.


        :param name: The name of this Project.
        :type name: str
        """

        self._name = name

    @property
    def tags(self) -> List[str]:
        """Gets the tags of this Project.

        An array of tags for this project.  # noqa: E501

        :return: The tags of this Project.
        :rtype: List[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List[str]):
        """Sets the tags of this Project.

        An array of tags for this project.  # noqa: E501

        :param tags: The tags of this Project.
        :type tags: List[str]
        """

        self._tags = tags
