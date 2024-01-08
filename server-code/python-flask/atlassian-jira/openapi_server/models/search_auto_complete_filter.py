from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SearchAutoCompleteFilter(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, include_collapsed_fields=False, project_ids=None):  # noqa: E501
        """SearchAutoCompleteFilter - a model defined in OpenAPI

        :param include_collapsed_fields: The include_collapsed_fields of this SearchAutoCompleteFilter.  # noqa: E501
        :type include_collapsed_fields: bool
        :param project_ids: The project_ids of this SearchAutoCompleteFilter.  # noqa: E501
        :type project_ids: List[int]
        """
        self.openapi_types = {
            'include_collapsed_fields': bool,
            'project_ids': List[int]
        }

        self.attribute_map = {
            'include_collapsed_fields': 'includeCollapsedFields',
            'project_ids': 'projectIds'
        }

        self._include_collapsed_fields = include_collapsed_fields
        self._project_ids = project_ids

    @classmethod
    def from_dict(cls, dikt) -> 'SearchAutoCompleteFilter':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SearchAutoCompleteFilter of this SearchAutoCompleteFilter.  # noqa: E501
        :rtype: SearchAutoCompleteFilter
        """
        return util.deserialize_model(dikt, cls)

    @property
    def include_collapsed_fields(self) -> bool:
        """Gets the include_collapsed_fields of this SearchAutoCompleteFilter.

        Include collapsed fields for fields that have non-unique names.  # noqa: E501

        :return: The include_collapsed_fields of this SearchAutoCompleteFilter.
        :rtype: bool
        """
        return self._include_collapsed_fields

    @include_collapsed_fields.setter
    def include_collapsed_fields(self, include_collapsed_fields: bool):
        """Sets the include_collapsed_fields of this SearchAutoCompleteFilter.

        Include collapsed fields for fields that have non-unique names.  # noqa: E501

        :param include_collapsed_fields: The include_collapsed_fields of this SearchAutoCompleteFilter.
        :type include_collapsed_fields: bool
        """

        self._include_collapsed_fields = include_collapsed_fields

    @property
    def project_ids(self) -> List[int]:
        """Gets the project_ids of this SearchAutoCompleteFilter.

        List of project IDs used to filter the visible field details returned.  # noqa: E501

        :return: The project_ids of this SearchAutoCompleteFilter.
        :rtype: List[int]
        """
        return self._project_ids

    @project_ids.setter
    def project_ids(self, project_ids: List[int]):
        """Sets the project_ids of this SearchAutoCompleteFilter.

        List of project IDs used to filter the visible field details returned.  # noqa: E501

        :param project_ids: The project_ids of this SearchAutoCompleteFilter.
        :type project_ids: List[int]
        """

        self._project_ids = project_ids