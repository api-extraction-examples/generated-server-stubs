from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_identifier_bean import ProjectIdentifierBean
from openapi_server import util

from openapi_server.models.project_identifier_bean import ProjectIdentifierBean  # noqa: E501

class PermittedProjects(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, projects=None):  # noqa: E501
        """PermittedProjects - a model defined in OpenAPI

        :param projects: The projects of this PermittedProjects.  # noqa: E501
        :type projects: List[ProjectIdentifierBean]
        """
        self.openapi_types = {
            'projects': List[ProjectIdentifierBean]
        }

        self.attribute_map = {
            'projects': 'projects'
        }

        self._projects = projects

    @classmethod
    def from_dict(cls, dikt) -> 'PermittedProjects':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PermittedProjects of this PermittedProjects.  # noqa: E501
        :rtype: PermittedProjects
        """
        return util.deserialize_model(dikt, cls)

    @property
    def projects(self) -> List[ProjectIdentifierBean]:
        """Gets the projects of this PermittedProjects.

        A list of projects.  # noqa: E501

        :return: The projects of this PermittedProjects.
        :rtype: List[ProjectIdentifierBean]
        """
        return self._projects

    @projects.setter
    def projects(self, projects: List[ProjectIdentifierBean]):
        """Sets the projects of this PermittedProjects.

        A list of projects.  # noqa: E501

        :param projects: The projects of this PermittedProjects.
        :type projects: List[ProjectIdentifierBean]
        """

        self._projects = projects
