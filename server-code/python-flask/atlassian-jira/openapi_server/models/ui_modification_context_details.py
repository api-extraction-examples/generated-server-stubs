from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UiModificationContextDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, is_available=None, issue_type_id=None, project_id=None, view_type=None):  # noqa: E501
        """UiModificationContextDetails - a model defined in OpenAPI

        :param id: The id of this UiModificationContextDetails.  # noqa: E501
        :type id: str
        :param is_available: The is_available of this UiModificationContextDetails.  # noqa: E501
        :type is_available: bool
        :param issue_type_id: The issue_type_id of this UiModificationContextDetails.  # noqa: E501
        :type issue_type_id: str
        :param project_id: The project_id of this UiModificationContextDetails.  # noqa: E501
        :type project_id: str
        :param view_type: The view_type of this UiModificationContextDetails.  # noqa: E501
        :type view_type: str
        """
        self.openapi_types = {
            'id': str,
            'is_available': bool,
            'issue_type_id': str,
            'project_id': str,
            'view_type': str
        }

        self.attribute_map = {
            'id': 'id',
            'is_available': 'isAvailable',
            'issue_type_id': 'issueTypeId',
            'project_id': 'projectId',
            'view_type': 'viewType'
        }

        self._id = id
        self._is_available = is_available
        self._issue_type_id = issue_type_id
        self._project_id = project_id
        self._view_type = view_type

    @classmethod
    def from_dict(cls, dikt) -> 'UiModificationContextDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UiModificationContextDetails of this UiModificationContextDetails.  # noqa: E501
        :rtype: UiModificationContextDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this UiModificationContextDetails.

        The ID of the UI modification context.  # noqa: E501

        :return: The id of this UiModificationContextDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this UiModificationContextDetails.

        The ID of the UI modification context.  # noqa: E501

        :param id: The id of this UiModificationContextDetails.
        :type id: str
        """

        self._id = id

    @property
    def is_available(self) -> bool:
        """Gets the is_available of this UiModificationContextDetails.

        Whether a context is available. For example, when a project is deleted the context becomes unavailable.  # noqa: E501

        :return: The is_available of this UiModificationContextDetails.
        :rtype: bool
        """
        return self._is_available

    @is_available.setter
    def is_available(self, is_available: bool):
        """Sets the is_available of this UiModificationContextDetails.

        Whether a context is available. For example, when a project is deleted the context becomes unavailable.  # noqa: E501

        :param is_available: The is_available of this UiModificationContextDetails.
        :type is_available: bool
        """

        self._is_available = is_available

    @property
    def issue_type_id(self) -> str:
        """Gets the issue_type_id of this UiModificationContextDetails.

        The issue type ID of the context.  # noqa: E501

        :return: The issue_type_id of this UiModificationContextDetails.
        :rtype: str
        """
        return self._issue_type_id

    @issue_type_id.setter
    def issue_type_id(self, issue_type_id: str):
        """Sets the issue_type_id of this UiModificationContextDetails.

        The issue type ID of the context.  # noqa: E501

        :param issue_type_id: The issue_type_id of this UiModificationContextDetails.
        :type issue_type_id: str
        """
        if issue_type_id is None:
            raise ValueError("Invalid value for `issue_type_id`, must not be `None`")  # noqa: E501

        self._issue_type_id = issue_type_id

    @property
    def project_id(self) -> str:
        """Gets the project_id of this UiModificationContextDetails.

        The project ID of the context.  # noqa: E501

        :return: The project_id of this UiModificationContextDetails.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: str):
        """Sets the project_id of this UiModificationContextDetails.

        The project ID of the context.  # noqa: E501

        :param project_id: The project_id of this UiModificationContextDetails.
        :type project_id: str
        """
        if project_id is None:
            raise ValueError("Invalid value for `project_id`, must not be `None`")  # noqa: E501

        self._project_id = project_id

    @property
    def view_type(self) -> str:
        """Gets the view_type of this UiModificationContextDetails.

        The view type of the context. Only `GIC` (Global Issue Create) is supported.  # noqa: E501

        :return: The view_type of this UiModificationContextDetails.
        :rtype: str
        """
        return self._view_type

    @view_type.setter
    def view_type(self, view_type: str):
        """Sets the view_type of this UiModificationContextDetails.

        The view type of the context. Only `GIC` (Global Issue Create) is supported.  # noqa: E501

        :param view_type: The view_type of this UiModificationContextDetails.
        :type view_type: str
        """
        if view_type is None:
            raise ValueError("Invalid value for `view_type`, must not be `None`")  # noqa: E501

        self._view_type = view_type
