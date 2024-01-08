from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.issue_type_screen_scheme import IssueTypeScreenScheme
from openapi_server import util

from openapi_server.models.issue_type_screen_scheme import IssueTypeScreenScheme  # noqa: E501

class IssueTypeScreenSchemesProjects(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, issue_type_screen_scheme=None, project_ids=None):  # noqa: E501
        """IssueTypeScreenSchemesProjects - a model defined in OpenAPI

        :param issue_type_screen_scheme: The issue_type_screen_scheme of this IssueTypeScreenSchemesProjects.  # noqa: E501
        :type issue_type_screen_scheme: IssueTypeScreenScheme
        :param project_ids: The project_ids of this IssueTypeScreenSchemesProjects.  # noqa: E501
        :type project_ids: List[str]
        """
        self.openapi_types = {
            'issue_type_screen_scheme': IssueTypeScreenScheme,
            'project_ids': List[str]
        }

        self.attribute_map = {
            'issue_type_screen_scheme': 'issueTypeScreenScheme',
            'project_ids': 'projectIds'
        }

        self._issue_type_screen_scheme = issue_type_screen_scheme
        self._project_ids = project_ids

    @classmethod
    def from_dict(cls, dikt) -> 'IssueTypeScreenSchemesProjects':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IssueTypeScreenSchemesProjects of this IssueTypeScreenSchemesProjects.  # noqa: E501
        :rtype: IssueTypeScreenSchemesProjects
        """
        return util.deserialize_model(dikt, cls)

    @property
    def issue_type_screen_scheme(self) -> IssueTypeScreenScheme:
        """Gets the issue_type_screen_scheme of this IssueTypeScreenSchemesProjects.


        :return: The issue_type_screen_scheme of this IssueTypeScreenSchemesProjects.
        :rtype: IssueTypeScreenScheme
        """
        return self._issue_type_screen_scheme

    @issue_type_screen_scheme.setter
    def issue_type_screen_scheme(self, issue_type_screen_scheme: IssueTypeScreenScheme):
        """Sets the issue_type_screen_scheme of this IssueTypeScreenSchemesProjects.


        :param issue_type_screen_scheme: The issue_type_screen_scheme of this IssueTypeScreenSchemesProjects.
        :type issue_type_screen_scheme: IssueTypeScreenScheme
        """
        if issue_type_screen_scheme is None:
            raise ValueError("Invalid value for `issue_type_screen_scheme`, must not be `None`")  # noqa: E501

        self._issue_type_screen_scheme = issue_type_screen_scheme

    @property
    def project_ids(self) -> List[str]:
        """Gets the project_ids of this IssueTypeScreenSchemesProjects.

        The IDs of the projects using the issue type screen scheme.  # noqa: E501

        :return: The project_ids of this IssueTypeScreenSchemesProjects.
        :rtype: List[str]
        """
        return self._project_ids

    @project_ids.setter
    def project_ids(self, project_ids: List[str]):
        """Sets the project_ids of this IssueTypeScreenSchemesProjects.

        The IDs of the projects using the issue type screen scheme.  # noqa: E501

        :param project_ids: The project_ids of this IssueTypeScreenSchemesProjects.
        :type project_ids: List[str]
        """
        if project_ids is None:
            raise ValueError("Invalid value for `project_ids`, must not be `None`")  # noqa: E501

        self._project_ids = project_ids