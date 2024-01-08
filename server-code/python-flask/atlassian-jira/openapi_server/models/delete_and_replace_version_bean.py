from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_replacement import CustomFieldReplacement
from openapi_server import util

from openapi_server.models.custom_field_replacement import CustomFieldReplacement  # noqa: E501

class DeleteAndReplaceVersionBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, custom_field_replacement_list=None, move_affected_issues_to=None, move_fix_issues_to=None):  # noqa: E501
        """DeleteAndReplaceVersionBean - a model defined in OpenAPI

        :param custom_field_replacement_list: The custom_field_replacement_list of this DeleteAndReplaceVersionBean.  # noqa: E501
        :type custom_field_replacement_list: List[CustomFieldReplacement]
        :param move_affected_issues_to: The move_affected_issues_to of this DeleteAndReplaceVersionBean.  # noqa: E501
        :type move_affected_issues_to: int
        :param move_fix_issues_to: The move_fix_issues_to of this DeleteAndReplaceVersionBean.  # noqa: E501
        :type move_fix_issues_to: int
        """
        self.openapi_types = {
            'custom_field_replacement_list': List[CustomFieldReplacement],
            'move_affected_issues_to': int,
            'move_fix_issues_to': int
        }

        self.attribute_map = {
            'custom_field_replacement_list': 'customFieldReplacementList',
            'move_affected_issues_to': 'moveAffectedIssuesTo',
            'move_fix_issues_to': 'moveFixIssuesTo'
        }

        self._custom_field_replacement_list = custom_field_replacement_list
        self._move_affected_issues_to = move_affected_issues_to
        self._move_fix_issues_to = move_fix_issues_to

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteAndReplaceVersionBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteAndReplaceVersionBean of this DeleteAndReplaceVersionBean.  # noqa: E501
        :rtype: DeleteAndReplaceVersionBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def custom_field_replacement_list(self) -> List[CustomFieldReplacement]:
        """Gets the custom_field_replacement_list of this DeleteAndReplaceVersionBean.

        An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.  # noqa: E501

        :return: The custom_field_replacement_list of this DeleteAndReplaceVersionBean.
        :rtype: List[CustomFieldReplacement]
        """
        return self._custom_field_replacement_list

    @custom_field_replacement_list.setter
    def custom_field_replacement_list(self, custom_field_replacement_list: List[CustomFieldReplacement]):
        """Sets the custom_field_replacement_list of this DeleteAndReplaceVersionBean.

        An array of custom field IDs (`customFieldId`) and version IDs (`moveTo`) to update when the fields contain the deleted version.  # noqa: E501

        :param custom_field_replacement_list: The custom_field_replacement_list of this DeleteAndReplaceVersionBean.
        :type custom_field_replacement_list: List[CustomFieldReplacement]
        """

        self._custom_field_replacement_list = custom_field_replacement_list

    @property
    def move_affected_issues_to(self) -> int:
        """Gets the move_affected_issues_to of this DeleteAndReplaceVersionBean.

        The ID of the version to update `affectedVersion` to when the field contains the deleted version.  # noqa: E501

        :return: The move_affected_issues_to of this DeleteAndReplaceVersionBean.
        :rtype: int
        """
        return self._move_affected_issues_to

    @move_affected_issues_to.setter
    def move_affected_issues_to(self, move_affected_issues_to: int):
        """Sets the move_affected_issues_to of this DeleteAndReplaceVersionBean.

        The ID of the version to update `affectedVersion` to when the field contains the deleted version.  # noqa: E501

        :param move_affected_issues_to: The move_affected_issues_to of this DeleteAndReplaceVersionBean.
        :type move_affected_issues_to: int
        """

        self._move_affected_issues_to = move_affected_issues_to

    @property
    def move_fix_issues_to(self) -> int:
        """Gets the move_fix_issues_to of this DeleteAndReplaceVersionBean.

        The ID of the version to update `fixVersion` to when the field contains the deleted version.  # noqa: E501

        :return: The move_fix_issues_to of this DeleteAndReplaceVersionBean.
        :rtype: int
        """
        return self._move_fix_issues_to

    @move_fix_issues_to.setter
    def move_fix_issues_to(self, move_fix_issues_to: int):
        """Sets the move_fix_issues_to of this DeleteAndReplaceVersionBean.

        The ID of the version to update `fixVersion` to when the field contains the deleted version.  # noqa: E501

        :param move_fix_issues_to: The move_fix_issues_to of this DeleteAndReplaceVersionBean.
        :type move_fix_issues_to: int
        """

        self._move_fix_issues_to = move_fix_issues_to