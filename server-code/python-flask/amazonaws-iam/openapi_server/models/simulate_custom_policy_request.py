from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SimulateCustomPolicyRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, policy_input_list=None, permissions_boundary_policy_input_list=None, action_names=None, resource_arns=None, resource_policy=None, resource_owner=None, caller_arn=None, context_entries=None, resource_handling_option=None, max_items=None, marker=None):  # noqa: E501
        """SimulateCustomPolicyRequest - a model defined in OpenAPI

        :param policy_input_list: The policy_input_list of this SimulateCustomPolicyRequest.  # noqa: E501
        :type policy_input_list: List
        :param permissions_boundary_policy_input_list: The permissions_boundary_policy_input_list of this SimulateCustomPolicyRequest.  # noqa: E501
        :type permissions_boundary_policy_input_list: List
        :param action_names: The action_names of this SimulateCustomPolicyRequest.  # noqa: E501
        :type action_names: List
        :param resource_arns: The resource_arns of this SimulateCustomPolicyRequest.  # noqa: E501
        :type resource_arns: List
        :param resource_policy: The resource_policy of this SimulateCustomPolicyRequest.  # noqa: E501
        :type resource_policy: str
        :param resource_owner: The resource_owner of this SimulateCustomPolicyRequest.  # noqa: E501
        :type resource_owner: str
        :param caller_arn: The caller_arn of this SimulateCustomPolicyRequest.  # noqa: E501
        :type caller_arn: str
        :param context_entries: The context_entries of this SimulateCustomPolicyRequest.  # noqa: E501
        :type context_entries: List
        :param resource_handling_option: The resource_handling_option of this SimulateCustomPolicyRequest.  # noqa: E501
        :type resource_handling_option: str
        :param max_items: The max_items of this SimulateCustomPolicyRequest.  # noqa: E501
        :type max_items: int
        :param marker: The marker of this SimulateCustomPolicyRequest.  # noqa: E501
        :type marker: str
        """
        self.openapi_types = {
            'policy_input_list': List,
            'permissions_boundary_policy_input_list': List,
            'action_names': List,
            'resource_arns': List,
            'resource_policy': str,
            'resource_owner': str,
            'caller_arn': str,
            'context_entries': List,
            'resource_handling_option': str,
            'max_items': int,
            'marker': str
        }

        self.attribute_map = {
            'policy_input_list': 'PolicyInputList',
            'permissions_boundary_policy_input_list': 'PermissionsBoundaryPolicyInputList',
            'action_names': 'ActionNames',
            'resource_arns': 'ResourceArns',
            'resource_policy': 'ResourcePolicy',
            'resource_owner': 'ResourceOwner',
            'caller_arn': 'CallerArn',
            'context_entries': 'ContextEntries',
            'resource_handling_option': 'ResourceHandlingOption',
            'max_items': 'MaxItems',
            'marker': 'Marker'
        }

        self._policy_input_list = policy_input_list
        self._permissions_boundary_policy_input_list = permissions_boundary_policy_input_list
        self._action_names = action_names
        self._resource_arns = resource_arns
        self._resource_policy = resource_policy
        self._resource_owner = resource_owner
        self._caller_arn = caller_arn
        self._context_entries = context_entries
        self._resource_handling_option = resource_handling_option
        self._max_items = max_items
        self._marker = marker

    @classmethod
    def from_dict(cls, dikt) -> 'SimulateCustomPolicyRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SimulateCustomPolicyRequest of this SimulateCustomPolicyRequest.  # noqa: E501
        :rtype: SimulateCustomPolicyRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def policy_input_list(self) -> List:
        """Gets the policy_input_list of this SimulateCustomPolicyRequest.


        :return: The policy_input_list of this SimulateCustomPolicyRequest.
        :rtype: List
        """
        return self._policy_input_list

    @policy_input_list.setter
    def policy_input_list(self, policy_input_list: List):
        """Sets the policy_input_list of this SimulateCustomPolicyRequest.


        :param policy_input_list: The policy_input_list of this SimulateCustomPolicyRequest.
        :type policy_input_list: List
        """
        if policy_input_list is None:
            raise ValueError("Invalid value for `policy_input_list`, must not be `None`")  # noqa: E501

        self._policy_input_list = policy_input_list

    @property
    def permissions_boundary_policy_input_list(self) -> List:
        """Gets the permissions_boundary_policy_input_list of this SimulateCustomPolicyRequest.


        :return: The permissions_boundary_policy_input_list of this SimulateCustomPolicyRequest.
        :rtype: List
        """
        return self._permissions_boundary_policy_input_list

    @permissions_boundary_policy_input_list.setter
    def permissions_boundary_policy_input_list(self, permissions_boundary_policy_input_list: List):
        """Sets the permissions_boundary_policy_input_list of this SimulateCustomPolicyRequest.


        :param permissions_boundary_policy_input_list: The permissions_boundary_policy_input_list of this SimulateCustomPolicyRequest.
        :type permissions_boundary_policy_input_list: List
        """

        self._permissions_boundary_policy_input_list = permissions_boundary_policy_input_list

    @property
    def action_names(self) -> List:
        """Gets the action_names of this SimulateCustomPolicyRequest.


        :return: The action_names of this SimulateCustomPolicyRequest.
        :rtype: List
        """
        return self._action_names

    @action_names.setter
    def action_names(self, action_names: List):
        """Sets the action_names of this SimulateCustomPolicyRequest.


        :param action_names: The action_names of this SimulateCustomPolicyRequest.
        :type action_names: List
        """
        if action_names is None:
            raise ValueError("Invalid value for `action_names`, must not be `None`")  # noqa: E501

        self._action_names = action_names

    @property
    def resource_arns(self) -> List:
        """Gets the resource_arns of this SimulateCustomPolicyRequest.


        :return: The resource_arns of this SimulateCustomPolicyRequest.
        :rtype: List
        """
        return self._resource_arns

    @resource_arns.setter
    def resource_arns(self, resource_arns: List):
        """Sets the resource_arns of this SimulateCustomPolicyRequest.


        :param resource_arns: The resource_arns of this SimulateCustomPolicyRequest.
        :type resource_arns: List
        """

        self._resource_arns = resource_arns

    @property
    def resource_policy(self) -> str:
        """Gets the resource_policy of this SimulateCustomPolicyRequest.


        :return: The resource_policy of this SimulateCustomPolicyRequest.
        :rtype: str
        """
        return self._resource_policy

    @resource_policy.setter
    def resource_policy(self, resource_policy: str):
        """Sets the resource_policy of this SimulateCustomPolicyRequest.


        :param resource_policy: The resource_policy of this SimulateCustomPolicyRequest.
        :type resource_policy: str
        """

        self._resource_policy = resource_policy

    @property
    def resource_owner(self) -> str:
        """Gets the resource_owner of this SimulateCustomPolicyRequest.


        :return: The resource_owner of this SimulateCustomPolicyRequest.
        :rtype: str
        """
        return self._resource_owner

    @resource_owner.setter
    def resource_owner(self, resource_owner: str):
        """Sets the resource_owner of this SimulateCustomPolicyRequest.


        :param resource_owner: The resource_owner of this SimulateCustomPolicyRequest.
        :type resource_owner: str
        """

        self._resource_owner = resource_owner

    @property
    def caller_arn(self) -> str:
        """Gets the caller_arn of this SimulateCustomPolicyRequest.


        :return: The caller_arn of this SimulateCustomPolicyRequest.
        :rtype: str
        """
        return self._caller_arn

    @caller_arn.setter
    def caller_arn(self, caller_arn: str):
        """Sets the caller_arn of this SimulateCustomPolicyRequest.


        :param caller_arn: The caller_arn of this SimulateCustomPolicyRequest.
        :type caller_arn: str
        """

        self._caller_arn = caller_arn

    @property
    def context_entries(self) -> List:
        """Gets the context_entries of this SimulateCustomPolicyRequest.


        :return: The context_entries of this SimulateCustomPolicyRequest.
        :rtype: List
        """
        return self._context_entries

    @context_entries.setter
    def context_entries(self, context_entries: List):
        """Sets the context_entries of this SimulateCustomPolicyRequest.


        :param context_entries: The context_entries of this SimulateCustomPolicyRequest.
        :type context_entries: List
        """

        self._context_entries = context_entries

    @property
    def resource_handling_option(self) -> str:
        """Gets the resource_handling_option of this SimulateCustomPolicyRequest.


        :return: The resource_handling_option of this SimulateCustomPolicyRequest.
        :rtype: str
        """
        return self._resource_handling_option

    @resource_handling_option.setter
    def resource_handling_option(self, resource_handling_option: str):
        """Sets the resource_handling_option of this SimulateCustomPolicyRequest.


        :param resource_handling_option: The resource_handling_option of this SimulateCustomPolicyRequest.
        :type resource_handling_option: str
        """

        self._resource_handling_option = resource_handling_option

    @property
    def max_items(self) -> int:
        """Gets the max_items of this SimulateCustomPolicyRequest.


        :return: The max_items of this SimulateCustomPolicyRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this SimulateCustomPolicyRequest.


        :param max_items: The max_items of this SimulateCustomPolicyRequest.
        :type max_items: int
        """

        self._max_items = max_items

    @property
    def marker(self) -> str:
        """Gets the marker of this SimulateCustomPolicyRequest.


        :return: The marker of this SimulateCustomPolicyRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this SimulateCustomPolicyRequest.


        :param marker: The marker of this SimulateCustomPolicyRequest.
        :type marker: str
        """

        self._marker = marker
