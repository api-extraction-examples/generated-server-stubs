from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_workflow_transition_rule import AppWorkflowTransitionRule
from openapi_server.models.workflow_id import WorkflowId
from openapi_server import util

from openapi_server.models.app_workflow_transition_rule import AppWorkflowTransitionRule  # noqa: E501
from openapi_server.models.workflow_id import WorkflowId  # noqa: E501

class WorkflowTransitionRules(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, conditions=None, post_functions=None, validators=None, workflow_id=None):  # noqa: E501
        """WorkflowTransitionRules - a model defined in OpenAPI

        :param conditions: The conditions of this WorkflowTransitionRules.  # noqa: E501
        :type conditions: List[AppWorkflowTransitionRule]
        :param post_functions: The post_functions of this WorkflowTransitionRules.  # noqa: E501
        :type post_functions: List[AppWorkflowTransitionRule]
        :param validators: The validators of this WorkflowTransitionRules.  # noqa: E501
        :type validators: List[AppWorkflowTransitionRule]
        :param workflow_id: The workflow_id of this WorkflowTransitionRules.  # noqa: E501
        :type workflow_id: WorkflowId
        """
        self.openapi_types = {
            'conditions': List[AppWorkflowTransitionRule],
            'post_functions': List[AppWorkflowTransitionRule],
            'validators': List[AppWorkflowTransitionRule],
            'workflow_id': WorkflowId
        }

        self.attribute_map = {
            'conditions': 'conditions',
            'post_functions': 'postFunctions',
            'validators': 'validators',
            'workflow_id': 'workflowId'
        }

        self._conditions = conditions
        self._post_functions = post_functions
        self._validators = validators
        self._workflow_id = workflow_id

    @classmethod
    def from_dict(cls, dikt) -> 'WorkflowTransitionRules':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkflowTransitionRules of this WorkflowTransitionRules.  # noqa: E501
        :rtype: WorkflowTransitionRules
        """
        return util.deserialize_model(dikt, cls)

    @property
    def conditions(self) -> List[AppWorkflowTransitionRule]:
        """Gets the conditions of this WorkflowTransitionRules.

        The list of conditions within the workflow.  # noqa: E501

        :return: The conditions of this WorkflowTransitionRules.
        :rtype: List[AppWorkflowTransitionRule]
        """
        return self._conditions

    @conditions.setter
    def conditions(self, conditions: List[AppWorkflowTransitionRule]):
        """Sets the conditions of this WorkflowTransitionRules.

        The list of conditions within the workflow.  # noqa: E501

        :param conditions: The conditions of this WorkflowTransitionRules.
        :type conditions: List[AppWorkflowTransitionRule]
        """

        self._conditions = conditions

    @property
    def post_functions(self) -> List[AppWorkflowTransitionRule]:
        """Gets the post_functions of this WorkflowTransitionRules.

        The list of post functions within the workflow.  # noqa: E501

        :return: The post_functions of this WorkflowTransitionRules.
        :rtype: List[AppWorkflowTransitionRule]
        """
        return self._post_functions

    @post_functions.setter
    def post_functions(self, post_functions: List[AppWorkflowTransitionRule]):
        """Sets the post_functions of this WorkflowTransitionRules.

        The list of post functions within the workflow.  # noqa: E501

        :param post_functions: The post_functions of this WorkflowTransitionRules.
        :type post_functions: List[AppWorkflowTransitionRule]
        """

        self._post_functions = post_functions

    @property
    def validators(self) -> List[AppWorkflowTransitionRule]:
        """Gets the validators of this WorkflowTransitionRules.

        The list of validators within the workflow.  # noqa: E501

        :return: The validators of this WorkflowTransitionRules.
        :rtype: List[AppWorkflowTransitionRule]
        """
        return self._validators

    @validators.setter
    def validators(self, validators: List[AppWorkflowTransitionRule]):
        """Sets the validators of this WorkflowTransitionRules.

        The list of validators within the workflow.  # noqa: E501

        :param validators: The validators of this WorkflowTransitionRules.
        :type validators: List[AppWorkflowTransitionRule]
        """

        self._validators = validators

    @property
    def workflow_id(self) -> WorkflowId:
        """Gets the workflow_id of this WorkflowTransitionRules.


        :return: The workflow_id of this WorkflowTransitionRules.
        :rtype: WorkflowId
        """
        return self._workflow_id

    @workflow_id.setter
    def workflow_id(self, workflow_id: WorkflowId):
        """Sets the workflow_id of this WorkflowTransitionRules.


        :param workflow_id: The workflow_id of this WorkflowTransitionRules.
        :type workflow_id: WorkflowId
        """
        if workflow_id is None:
            raise ValueError("Invalid value for `workflow_id`, must not be `None`")  # noqa: E501

        self._workflow_id = workflow_id
