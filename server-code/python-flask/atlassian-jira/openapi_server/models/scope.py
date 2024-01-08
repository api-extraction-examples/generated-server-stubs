from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.scope_project import ScopeProject
from openapi_server import util

from openapi_server.models.scope_project import ScopeProject  # noqa: E501

class Scope(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, project=None, type=None):  # noqa: E501
        """Scope - a model defined in OpenAPI

        :param project: The project of this Scope.  # noqa: E501
        :type project: ScopeProject
        :param type: The type of this Scope.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'project': ScopeProject,
            'type': str
        }

        self.attribute_map = {
            'project': 'project',
            'type': 'type'
        }

        self._project = project
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'Scope':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Scope of this Scope.  # noqa: E501
        :rtype: Scope
        """
        return util.deserialize_model(dikt, cls)

    @property
    def project(self) -> ScopeProject:
        """Gets the project of this Scope.


        :return: The project of this Scope.
        :rtype: ScopeProject
        """
        return self._project

    @project.setter
    def project(self, project: ScopeProject):
        """Sets the project of this Scope.


        :param project: The project of this Scope.
        :type project: ScopeProject
        """

        self._project = project

    @property
    def type(self) -> str:
        """Gets the type of this Scope.

        The type of scope.  # noqa: E501

        :return: The type of this Scope.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this Scope.

        The type of scope.  # noqa: E501

        :param type: The type of this Scope.
        :type type: str
        """
        allowed_values = ["PROJECT", "TEMPLATE"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
