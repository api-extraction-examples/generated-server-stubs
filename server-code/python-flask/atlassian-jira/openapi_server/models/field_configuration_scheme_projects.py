from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.field_configuration_scheme import FieldConfigurationScheme
from openapi_server import util

from openapi_server.models.field_configuration_scheme import FieldConfigurationScheme  # noqa: E501

class FieldConfigurationSchemeProjects(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, field_configuration_scheme=None, project_ids=None):  # noqa: E501
        """FieldConfigurationSchemeProjects - a model defined in OpenAPI

        :param field_configuration_scheme: The field_configuration_scheme of this FieldConfigurationSchemeProjects.  # noqa: E501
        :type field_configuration_scheme: FieldConfigurationScheme
        :param project_ids: The project_ids of this FieldConfigurationSchemeProjects.  # noqa: E501
        :type project_ids: List[str]
        """
        self.openapi_types = {
            'field_configuration_scheme': FieldConfigurationScheme,
            'project_ids': List[str]
        }

        self.attribute_map = {
            'field_configuration_scheme': 'fieldConfigurationScheme',
            'project_ids': 'projectIds'
        }

        self._field_configuration_scheme = field_configuration_scheme
        self._project_ids = project_ids

    @classmethod
    def from_dict(cls, dikt) -> 'FieldConfigurationSchemeProjects':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FieldConfigurationSchemeProjects of this FieldConfigurationSchemeProjects.  # noqa: E501
        :rtype: FieldConfigurationSchemeProjects
        """
        return util.deserialize_model(dikt, cls)

    @property
    def field_configuration_scheme(self) -> FieldConfigurationScheme:
        """Gets the field_configuration_scheme of this FieldConfigurationSchemeProjects.


        :return: The field_configuration_scheme of this FieldConfigurationSchemeProjects.
        :rtype: FieldConfigurationScheme
        """
        return self._field_configuration_scheme

    @field_configuration_scheme.setter
    def field_configuration_scheme(self, field_configuration_scheme: FieldConfigurationScheme):
        """Sets the field_configuration_scheme of this FieldConfigurationSchemeProjects.


        :param field_configuration_scheme: The field_configuration_scheme of this FieldConfigurationSchemeProjects.
        :type field_configuration_scheme: FieldConfigurationScheme
        """

        self._field_configuration_scheme = field_configuration_scheme

    @property
    def project_ids(self) -> List[str]:
        """Gets the project_ids of this FieldConfigurationSchemeProjects.

        The IDs of projects using the field configuration scheme.  # noqa: E501

        :return: The project_ids of this FieldConfigurationSchemeProjects.
        :rtype: List[str]
        """
        return self._project_ids

    @project_ids.setter
    def project_ids(self, project_ids: List[str]):
        """Sets the project_ids of this FieldConfigurationSchemeProjects.

        The IDs of projects using the field configuration scheme.  # noqa: E501

        :param project_ids: The project_ids of this FieldConfigurationSchemeProjects.
        :type project_ids: List[str]
        """
        if project_ids is None:
            raise ValueError("Invalid value for `project_ids`, must not be `None`")  # noqa: E501

        self._project_ids = project_ids
