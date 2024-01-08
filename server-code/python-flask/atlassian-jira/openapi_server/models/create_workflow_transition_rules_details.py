from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.create_workflow_condition import CreateWorkflowCondition
from openapi_server.models.create_workflow_transition_rule import CreateWorkflowTransitionRule
from openapi_server import util

from openapi_server.models.create_workflow_condition import CreateWorkflowCondition  # noqa: E501
from openapi_server.models.create_workflow_transition_rule import CreateWorkflowTransitionRule  # noqa: E501

class CreateWorkflowTransitionRulesDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conditions=None, post_functions=None, validators=None):  # noqa: E501
        """CreateWorkflowTransitionRulesDetails - a model defined in OpenAPI

        :param conditions: The conditions of this CreateWorkflowTransitionRulesDetails.  # noqa: E501
        :type conditions: CreateWorkflowCondition
        :param post_functions: The post_functions of this CreateWorkflowTransitionRulesDetails.  # noqa: E501
        :type post_functions: List[CreateWorkflowTransitionRule]
        :param validators: The validators of this CreateWorkflowTransitionRulesDetails.  # noqa: E501
        :type validators: List[CreateWorkflowTransitionRule]
        """
        self.openapi_types = {
            'conditions': CreateWorkflowCondition,
            'post_functions': List[CreateWorkflowTransitionRule],
            'validators': List[CreateWorkflowTransitionRule]
        }

        self.attribute_map = {
            'conditions': 'conditions',
            'post_functions': 'postFunctions',
            'validators': 'validators'
        }

        self._conditions = conditions
        self._post_functions = post_functions
        self._validators = validators

    @classmethod
    def from_dict(cls, dikt) -> 'CreateWorkflowTransitionRulesDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CreateWorkflowTransitionRulesDetails of this CreateWorkflowTransitionRulesDetails.  # noqa: E501
        :rtype: CreateWorkflowTransitionRulesDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conditions(self) -> CreateWorkflowCondition:
        """Gets the conditions of this CreateWorkflowTransitionRulesDetails.


        :return: The conditions of this CreateWorkflowTransitionRulesDetails.
        :rtype: CreateWorkflowCondition
        """
        return self._conditions

    @conditions.setter
    def conditions(self, conditions: CreateWorkflowCondition):
        """Sets the conditions of this CreateWorkflowTransitionRulesDetails.


        :param conditions: The conditions of this CreateWorkflowTransitionRulesDetails.
        :type conditions: CreateWorkflowCondition
        """

        self._conditions = conditions

    @property
    def post_functions(self) -> List[CreateWorkflowTransitionRule]:
        """Gets the post_functions of this CreateWorkflowTransitionRulesDetails.

        The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \"postFunctions\": [         {             \"type\": \"IssueCreateFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"1\",                     \"name\": \"issue_created\"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \"postFunctions\": [         {             \"type\": \"UpdateIssueStatusFunction\"         },         {             \"type\": \"CreateCommentFunction\"         },         {             \"type\": \"GenerateChangeHistoryFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"13\",                     \"name\": \"issue_generic\"                 }             }         }     ]  # noqa: E501

        :return: The post_functions of this CreateWorkflowTransitionRulesDetails.
        :rtype: List[CreateWorkflowTransitionRule]
        """
        return self._post_functions

    @post_functions.setter
    def post_functions(self, post_functions: List[CreateWorkflowTransitionRule]):
        """Sets the post_functions of this CreateWorkflowTransitionRulesDetails.

        The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      \"postFunctions\": [         {             \"type\": \"IssueCreateFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"1\",                     \"name\": \"issue_created\"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      \"postFunctions\": [         {             \"type\": \"UpdateIssueStatusFunction\"         },         {             \"type\": \"CreateCommentFunction\"         },         {             \"type\": \"GenerateChangeHistoryFunction\"         },         {             \"type\": \"IssueReindexFunction\"         },         {             \"type\": \"FireIssueEventFunction\",             \"configuration\": {                 \"event\": {                     \"id\": \"13\",                     \"name\": \"issue_generic\"                 }             }         }     ]  # noqa: E501

        :param post_functions: The post_functions of this CreateWorkflowTransitionRulesDetails.
        :type post_functions: List[CreateWorkflowTransitionRule]
        """

        self._post_functions = post_functions

    @property
    def validators(self) -> List[CreateWorkflowTransitionRule]:
        """Gets the validators of this CreateWorkflowTransitionRulesDetails.

        The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \"validators\": [         {             \"type\": \"PermissionValidator\",             \"configuration\": {                 \"permissionKey\": \"CREATE_ISSUES\"             }         }     ]  # noqa: E501

        :return: The validators of this CreateWorkflowTransitionRulesDetails.
        :rtype: List[CreateWorkflowTransitionRule]
        """
        return self._validators

    @validators.setter
    def validators(self, validators: List[CreateWorkflowTransitionRule]):
        """Sets the validators of this CreateWorkflowTransitionRulesDetails.

        The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      \"validators\": [         {             \"type\": \"PermissionValidator\",             \"configuration\": {                 \"permissionKey\": \"CREATE_ISSUES\"             }         }     ]  # noqa: E501

        :param validators: The validators of this CreateWorkflowTransitionRulesDetails.
        :type validators: List[CreateWorkflowTransitionRule]
        """

        self._validators = validators