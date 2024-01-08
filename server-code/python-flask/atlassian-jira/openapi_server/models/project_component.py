from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_component_assignee import ProjectComponentAssignee
from openapi_server.models.project_component_lead import ProjectComponentLead
from openapi_server.models.project_component_real_assignee import ProjectComponentRealAssignee
from openapi_server import util

from openapi_server.models.project_component_assignee import ProjectComponentAssignee  # noqa: E501
from openapi_server.models.project_component_lead import ProjectComponentLead  # noqa: E501
from openapi_server.models.project_component_real_assignee import ProjectComponentRealAssignee  # noqa: E501

class ProjectComponent(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assignee=None, assignee_type=None, description=None, id=None, is_assignee_type_valid=None, lead=None, lead_account_id=None, lead_user_name=None, name=None, project=None, project_id=None, real_assignee=None, real_assignee_type=None, _self=None):  # noqa: E501
        """ProjectComponent - a model defined in OpenAPI

        :param assignee: The assignee of this ProjectComponent.  # noqa: E501
        :type assignee: ProjectComponentAssignee
        :param assignee_type: The assignee_type of this ProjectComponent.  # noqa: E501
        :type assignee_type: str
        :param description: The description of this ProjectComponent.  # noqa: E501
        :type description: str
        :param id: The id of this ProjectComponent.  # noqa: E501
        :type id: str
        :param is_assignee_type_valid: The is_assignee_type_valid of this ProjectComponent.  # noqa: E501
        :type is_assignee_type_valid: bool
        :param lead: The lead of this ProjectComponent.  # noqa: E501
        :type lead: ProjectComponentLead
        :param lead_account_id: The lead_account_id of this ProjectComponent.  # noqa: E501
        :type lead_account_id: str
        :param lead_user_name: The lead_user_name of this ProjectComponent.  # noqa: E501
        :type lead_user_name: str
        :param name: The name of this ProjectComponent.  # noqa: E501
        :type name: str
        :param project: The project of this ProjectComponent.  # noqa: E501
        :type project: str
        :param project_id: The project_id of this ProjectComponent.  # noqa: E501
        :type project_id: int
        :param real_assignee: The real_assignee of this ProjectComponent.  # noqa: E501
        :type real_assignee: ProjectComponentRealAssignee
        :param real_assignee_type: The real_assignee_type of this ProjectComponent.  # noqa: E501
        :type real_assignee_type: str
        :param _self: The _self of this ProjectComponent.  # noqa: E501
        :type _self: str
        """
        self.openapi_types = {
            'assignee': ProjectComponentAssignee,
            'assignee_type': str,
            'description': str,
            'id': str,
            'is_assignee_type_valid': bool,
            'lead': ProjectComponentLead,
            'lead_account_id': str,
            'lead_user_name': str,
            'name': str,
            'project': str,
            'project_id': int,
            'real_assignee': ProjectComponentRealAssignee,
            'real_assignee_type': str,
            '_self': str
        }

        self.attribute_map = {
            'assignee': 'assignee',
            'assignee_type': 'assigneeType',
            'description': 'description',
            'id': 'id',
            'is_assignee_type_valid': 'isAssigneeTypeValid',
            'lead': 'lead',
            'lead_account_id': 'leadAccountId',
            'lead_user_name': 'leadUserName',
            'name': 'name',
            'project': 'project',
            'project_id': 'projectId',
            'real_assignee': 'realAssignee',
            'real_assignee_type': 'realAssigneeType',
            '_self': 'self'
        }

        self._assignee = assignee
        self._assignee_type = assignee_type
        self._description = description
        self._id = id
        self._is_assignee_type_valid = is_assignee_type_valid
        self._lead = lead
        self._lead_account_id = lead_account_id
        self._lead_user_name = lead_user_name
        self._name = name
        self._project = project
        self._project_id = project_id
        self._real_assignee = real_assignee
        self._real_assignee_type = real_assignee_type
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'ProjectComponent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ProjectComponent of this ProjectComponent.  # noqa: E501
        :rtype: ProjectComponent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assignee(self) -> ProjectComponentAssignee:
        """Gets the assignee of this ProjectComponent.


        :return: The assignee of this ProjectComponent.
        :rtype: ProjectComponentAssignee
        """
        return self._assignee

    @assignee.setter
    def assignee(self, assignee: ProjectComponentAssignee):
        """Sets the assignee of this ProjectComponent.


        :param assignee: The assignee of this ProjectComponent.
        :type assignee: ProjectComponentAssignee
        """

        self._assignee = assignee

    @property
    def assignee_type(self) -> str:
        """Gets the assignee_type of this ProjectComponent.

        The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.  # noqa: E501

        :return: The assignee_type of this ProjectComponent.
        :rtype: str
        """
        return self._assignee_type

    @assignee_type.setter
    def assignee_type(self, assignee_type: str):
        """Sets the assignee_type of this ProjectComponent.

        The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.  # noqa: E501

        :param assignee_type: The assignee_type of this ProjectComponent.
        :type assignee_type: str
        """
        allowed_values = ["PROJECT_DEFAULT", "COMPONENT_LEAD", "PROJECT_LEAD", "UNASSIGNED"]  # noqa: E501
        if assignee_type not in allowed_values:
            raise ValueError(
                "Invalid value for `assignee_type` ({0}), must be one of {1}"
                .format(assignee_type, allowed_values)
            )

        self._assignee_type = assignee_type

    @property
    def description(self) -> str:
        """Gets the description of this ProjectComponent.

        The description for the component. Optional when creating or updating a component.  # noqa: E501

        :return: The description of this ProjectComponent.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ProjectComponent.

        The description for the component. Optional when creating or updating a component.  # noqa: E501

        :param description: The description of this ProjectComponent.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> str:
        """Gets the id of this ProjectComponent.

        The unique identifier for the component.  # noqa: E501

        :return: The id of this ProjectComponent.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ProjectComponent.

        The unique identifier for the component.  # noqa: E501

        :param id: The id of this ProjectComponent.
        :type id: str
        """

        self._id = id

    @property
    def is_assignee_type_valid(self) -> bool:
        """Gets the is_assignee_type_valid of this ProjectComponent.

        Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.  # noqa: E501

        :return: The is_assignee_type_valid of this ProjectComponent.
        :rtype: bool
        """
        return self._is_assignee_type_valid

    @is_assignee_type_valid.setter
    def is_assignee_type_valid(self, is_assignee_type_valid: bool):
        """Sets the is_assignee_type_valid of this ProjectComponent.

        Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.  # noqa: E501

        :param is_assignee_type_valid: The is_assignee_type_valid of this ProjectComponent.
        :type is_assignee_type_valid: bool
        """

        self._is_assignee_type_valid = is_assignee_type_valid

    @property
    def lead(self) -> ProjectComponentLead:
        """Gets the lead of this ProjectComponent.


        :return: The lead of this ProjectComponent.
        :rtype: ProjectComponentLead
        """
        return self._lead

    @lead.setter
    def lead(self, lead: ProjectComponentLead):
        """Sets the lead of this ProjectComponent.


        :param lead: The lead of this ProjectComponent.
        :type lead: ProjectComponentLead
        """

        self._lead = lead

    @property
    def lead_account_id(self) -> str:
        """Gets the lead_account_id of this ProjectComponent.

        The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.  # noqa: E501

        :return: The lead_account_id of this ProjectComponent.
        :rtype: str
        """
        return self._lead_account_id

    @lead_account_id.setter
    def lead_account_id(self, lead_account_id: str):
        """Sets the lead_account_id of this ProjectComponent.

        The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.  # noqa: E501

        :param lead_account_id: The lead_account_id of this ProjectComponent.
        :type lead_account_id: str
        """
        if lead_account_id is not None and len(lead_account_id) > 128:
            raise ValueError("Invalid value for `lead_account_id`, length must be less than or equal to `128`")  # noqa: E501

        self._lead_account_id = lead_account_id

    @property
    def lead_user_name(self) -> str:
        """Gets the lead_user_name of this ProjectComponent.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :return: The lead_user_name of this ProjectComponent.
        :rtype: str
        """
        return self._lead_user_name

    @lead_user_name.setter
    def lead_user_name(self, lead_user_name: str):
        """Sets the lead_user_name of this ProjectComponent.

        This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.  # noqa: E501

        :param lead_user_name: The lead_user_name of this ProjectComponent.
        :type lead_user_name: str
        """

        self._lead_user_name = lead_user_name

    @property
    def name(self) -> str:
        """Gets the name of this ProjectComponent.

        The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.  # noqa: E501

        :return: The name of this ProjectComponent.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this ProjectComponent.

        The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.  # noqa: E501

        :param name: The name of this ProjectComponent.
        :type name: str
        """

        self._name = name

    @property
    def project(self) -> str:
        """Gets the project of this ProjectComponent.

        The key of the project the component is assigned to. Required when creating a component. Can't be updated.  # noqa: E501

        :return: The project of this ProjectComponent.
        :rtype: str
        """
        return self._project

    @project.setter
    def project(self, project: str):
        """Sets the project of this ProjectComponent.

        The key of the project the component is assigned to. Required when creating a component. Can't be updated.  # noqa: E501

        :param project: The project of this ProjectComponent.
        :type project: str
        """

        self._project = project

    @property
    def project_id(self) -> int:
        """Gets the project_id of this ProjectComponent.

        The ID of the project the component is assigned to.  # noqa: E501

        :return: The project_id of this ProjectComponent.
        :rtype: int
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: int):
        """Sets the project_id of this ProjectComponent.

        The ID of the project the component is assigned to.  # noqa: E501

        :param project_id: The project_id of this ProjectComponent.
        :type project_id: int
        """

        self._project_id = project_id

    @property
    def real_assignee(self) -> ProjectComponentRealAssignee:
        """Gets the real_assignee of this ProjectComponent.


        :return: The real_assignee of this ProjectComponent.
        :rtype: ProjectComponentRealAssignee
        """
        return self._real_assignee

    @real_assignee.setter
    def real_assignee(self, real_assignee: ProjectComponentRealAssignee):
        """Sets the real_assignee of this ProjectComponent.


        :param real_assignee: The real_assignee of this ProjectComponent.
        :type real_assignee: ProjectComponentRealAssignee
        """

        self._real_assignee = real_assignee

    @property
    def real_assignee_type(self) -> str:
        """Gets the real_assignee_type of this ProjectComponent.

        The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.  # noqa: E501

        :return: The real_assignee_type of this ProjectComponent.
        :rtype: str
        """
        return self._real_assignee_type

    @real_assignee_type.setter
    def real_assignee_type(self, real_assignee_type: str):
        """Sets the real_assignee_type of this ProjectComponent.

        The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.  # noqa: E501

        :param real_assignee_type: The real_assignee_type of this ProjectComponent.
        :type real_assignee_type: str
        """
        allowed_values = ["PROJECT_DEFAULT", "COMPONENT_LEAD", "PROJECT_LEAD", "UNASSIGNED"]  # noqa: E501
        if real_assignee_type not in allowed_values:
            raise ValueError(
                "Invalid value for `real_assignee_type` ({0}), must be one of {1}"
                .format(real_assignee_type, allowed_values)
            )

        self._real_assignee_type = real_assignee_type

    @property
    def _self(self) -> str:
        """Gets the _self of this ProjectComponent.

        The URL of the component.  # noqa: E501

        :return: The _self of this ProjectComponent.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this ProjectComponent.

        The URL of the component.  # noqa: E501

        :param _self: The _self of this ProjectComponent.
        :type _self: str
        """

        self.__self = _self