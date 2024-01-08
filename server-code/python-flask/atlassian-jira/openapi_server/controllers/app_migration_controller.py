import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.connect_custom_field_values import ConnectCustomFieldValues  # noqa: E501
from openapi_server.models.entity_property_details import EntityPropertyDetails  # noqa: E501
from openapi_server.models.workflow_rules_search import WorkflowRulesSearch  # noqa: E501
from openapi_server.models.workflow_rules_search_details import WorkflowRulesSearchDetails  # noqa: E501
from openapi_server import util


def app_issue_field_value_update_resource_update_issue_fields_put(atlassian_transfer_id, connect_custom_field_values):  # noqa: E501
    """Bulk update custom field value

    Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.  **[Permissions](#permissions) required:** Only Connect apps can make this request. # noqa: E501

    :param atlassian_transfer_id: The ID of the transfer.
    :type atlassian_transfer_id: str
    :type atlassian_transfer_id: str
    :param connect_custom_field_values: 
    :type connect_custom_field_values: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        connect_custom_field_values = ConnectCustomFieldValues.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def migration_resource_update_entity_properties_value_put(atlassian_transfer_id, entity_type, entity_property_details):  # noqa: E501
    """Bulk update entity properties

    Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration. # noqa: E501

    :param atlassian_transfer_id: The app migration transfer ID.
    :type atlassian_transfer_id: str
    :type atlassian_transfer_id: str
    :param entity_type: The type indicating the object that contains the entity properties.
    :type entity_type: str
    :param entity_property_details: 
    :type entity_property_details: list | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        entity_property_details = [EntityPropertyDetails.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def migration_resource_workflow_rule_search_post(atlassian_transfer_id, workflow_rules_search):  # noqa: E501
    """Get workflow transition rule configurations

    Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app. # noqa: E501

    :param atlassian_transfer_id: The app migration transfer ID.
    :type atlassian_transfer_id: str
    :type atlassian_transfer_id: str
    :param workflow_rules_search: 
    :type workflow_rules_search: dict | bytes

    :rtype: Union[WorkflowRulesSearchDetails, Tuple[WorkflowRulesSearchDetails, int], Tuple[WorkflowRulesSearchDetails, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        workflow_rules_search = WorkflowRulesSearch.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
