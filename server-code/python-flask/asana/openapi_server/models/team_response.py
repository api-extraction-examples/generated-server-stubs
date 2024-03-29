from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.team_response_all_of_organization import TeamResponseAllOfOrganization
from openapi_server import util

from openapi_server.models.team_response_all_of_organization import TeamResponseAllOfOrganization  # noqa: E501

class TeamResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, description=None, html_description=None, organization=None, permalink_url=None, visibility=None):  # noqa: E501
        """TeamResponse - a model defined in OpenAPI

        :param gid: The gid of this TeamResponse.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this TeamResponse.  # noqa: E501
        :type resource_type: str
        :param name: The name of this TeamResponse.  # noqa: E501
        :type name: str
        :param description: The description of this TeamResponse.  # noqa: E501
        :type description: str
        :param html_description: The html_description of this TeamResponse.  # noqa: E501
        :type html_description: str
        :param organization: The organization of this TeamResponse.  # noqa: E501
        :type organization: TeamResponseAllOfOrganization
        :param permalink_url: The permalink_url of this TeamResponse.  # noqa: E501
        :type permalink_url: str
        :param visibility: The visibility of this TeamResponse.  # noqa: E501
        :type visibility: str
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'description': str,
            'html_description': str,
            'organization': TeamResponseAllOfOrganization,
            'permalink_url': str,
            'visibility': str
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'description': 'description',
            'html_description': 'html_description',
            'organization': 'organization',
            'permalink_url': 'permalink_url',
            'visibility': 'visibility'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._description = description
        self._html_description = html_description
        self._organization = organization
        self._permalink_url = permalink_url
        self._visibility = visibility

    @classmethod
    def from_dict(cls, dikt) -> 'TeamResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TeamResponse of this TeamResponse.  # noqa: E501
        :rtype: TeamResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this TeamResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this TeamResponse.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this TeamResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this TeamResponse.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this TeamResponse.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this TeamResponse.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this TeamResponse.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this TeamResponse.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this TeamResponse.

        The name of the team.  # noqa: E501

        :return: The name of this TeamResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this TeamResponse.

        The name of the team.  # noqa: E501

        :param name: The name of this TeamResponse.
        :type name: str
        """

        self._name = name

    @property
    def description(self) -> str:
        """Gets the description of this TeamResponse.

        [Opt In](/docs/input-output-options). The description of the team.   # noqa: E501

        :return: The description of this TeamResponse.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this TeamResponse.

        [Opt In](/docs/input-output-options). The description of the team.   # noqa: E501

        :param description: The description of this TeamResponse.
        :type description: str
        """

        self._description = description

    @property
    def html_description(self) -> str:
        """Gets the html_description of this TeamResponse.

        [Opt In](/docs/input-output-options). The description of the team with formatting as HTML.   # noqa: E501

        :return: The html_description of this TeamResponse.
        :rtype: str
        """
        return self._html_description

    @html_description.setter
    def html_description(self, html_description: str):
        """Sets the html_description of this TeamResponse.

        [Opt In](/docs/input-output-options). The description of the team with formatting as HTML.   # noqa: E501

        :param html_description: The html_description of this TeamResponse.
        :type html_description: str
        """

        self._html_description = html_description

    @property
    def organization(self) -> TeamResponseAllOfOrganization:
        """Gets the organization of this TeamResponse.


        :return: The organization of this TeamResponse.
        :rtype: TeamResponseAllOfOrganization
        """
        return self._organization

    @organization.setter
    def organization(self, organization: TeamResponseAllOfOrganization):
        """Sets the organization of this TeamResponse.


        :param organization: The organization of this TeamResponse.
        :type organization: TeamResponseAllOfOrganization
        """

        self._organization = organization

    @property
    def permalink_url(self) -> str:
        """Gets the permalink_url of this TeamResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :return: The permalink_url of this TeamResponse.
        :rtype: str
        """
        return self._permalink_url

    @permalink_url.setter
    def permalink_url(self, permalink_url: str):
        """Sets the permalink_url of this TeamResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :param permalink_url: The permalink_url of this TeamResponse.
        :type permalink_url: str
        """

        self._permalink_url = permalink_url

    @property
    def visibility(self) -> str:
        """Gets the visibility of this TeamResponse.

        The visibility of the team to users in the same organization   # noqa: E501

        :return: The visibility of this TeamResponse.
        :rtype: str
        """
        return self._visibility

    @visibility.setter
    def visibility(self, visibility: str):
        """Sets the visibility of this TeamResponse.

        The visibility of the team to users in the same organization   # noqa: E501

        :param visibility: The visibility of this TeamResponse.
        :type visibility: str
        """
        allowed_values = ["secret", "request_to_join", "public"]  # noqa: E501
        if visibility not in allowed_values:
            raise ValueError(
                "Invalid value for `visibility` ({0}), must be one of {1}"
                .format(visibility, allowed_values)
            )

        self._visibility = visibility
