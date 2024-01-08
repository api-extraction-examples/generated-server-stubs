import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.create_custom_field201_response import CreateCustomField201Response  # noqa: E501
from openapi_server.models.create_custom_field_request import CreateCustomFieldRequest  # noqa: E501
from openapi_server.models.create_enum_option_for_custom_field201_response import CreateEnumOptionForCustomField201Response  # noqa: E501
from openapi_server.models.create_enum_option_for_custom_field_request import CreateEnumOptionForCustomFieldRequest  # noqa: E501
from openapi_server.models.delete_attachment200_response import DeleteAttachment200Response  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.get_custom_fields_for_workspace200_response import GetCustomFieldsForWorkspace200Response  # noqa: E501
from openapi_server.models.insert_enum_option_for_custom_field_request import InsertEnumOptionForCustomFieldRequest  # noqa: E501
from openapi_server import util


def create_custom_field(opt_pretty=None, opt_fields=None, limit=None, offset=None, create_custom_field_request=None):  # noqa: E501
    """Create a custom field

    Creates a new custom field in a workspace. Every custom field is required to be created in a specific workspace, and this workspace cannot be changed once set.  A custom field’s name must be unique within a workspace and not conflict with names of existing task properties such as &#x60;Due Date&#x60; or &#x60;Assignee&#x60;. A custom field’s type must be one of &#x60;text&#x60;, &#x60;enum&#x60;, &#x60;multi_enum&#x60;, &#x60;number&#x60;, &#x60;date&#x60;, or &#x60;people&#x60;.  Returns the full record of the newly created custom field. # noqa: E501

    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param create_custom_field_request: The custom field object to create.
    :type create_custom_field_request: dict | bytes

    :rtype: Union[CreateCustomField201Response, Tuple[CreateCustomField201Response, int], Tuple[CreateCustomField201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_custom_field_request = CreateCustomFieldRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_enum_option_for_custom_field(custom_field_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None, create_enum_option_for_custom_field_request=None):  # noqa: E501
    """Create an enum option

    Creates an enum option and adds it to this custom field’s list of enum options. A custom field can have at most 500 enum options (including disabled options). By default new enum options are inserted at the end of a custom field’s list. Locked custom fields can only have enum options added by the user who locked the field. Returns the full record of the newly created enum option. # noqa: E501

    :param custom_field_gid: Globally unique identifier for the custom field.
    :type custom_field_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str
    :param create_enum_option_for_custom_field_request: The enum option object to create.
    :type create_enum_option_for_custom_field_request: dict | bytes

    :rtype: Union[CreateEnumOptionForCustomField201Response, Tuple[CreateEnumOptionForCustomField201Response, int], Tuple[CreateEnumOptionForCustomField201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_enum_option_for_custom_field_request = CreateEnumOptionForCustomFieldRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_custom_field(custom_field_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Delete a custom field

    A specific, existing custom field can be deleted by making a DELETE request on the URL for that custom field. Locked custom fields can only be deleted by the user who locked the field. Returns an empty data record. # noqa: E501

    :param custom_field_gid: Globally unique identifier for the custom field.
    :type custom_field_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[DeleteAttachment200Response, Tuple[DeleteAttachment200Response, int], Tuple[DeleteAttachment200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_field(custom_field_gid, opt_pretty=None, opt_fields=None):  # noqa: E501
    """Get a custom field

    Get the complete definition of a custom field’s metadata.  Since custom fields can be defined for one of a number of types, and these types have different data and behaviors, there are fields that are relevant to a particular type. For instance, as noted above, enum_options is only relevant for the enum type and defines the set of choices that the enum could represent. The examples below show some of these type-specific custom field definitions. # noqa: E501

    :param custom_field_gid: Globally unique identifier for the custom field.
    :type custom_field_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]

    :rtype: Union[CreateCustomField201Response, Tuple[CreateCustomField201Response, int], Tuple[CreateCustomField201Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_fields_for_workspace(workspace_gid, opt_pretty=None, opt_fields=None, limit=None, offset=None):  # noqa: E501
    """Get a workspace&#39;s custom fields

    Returns a list of the compact representation of all of the custom fields in a workspace. # noqa: E501

    :param workspace_gid: Globally unique identifier for the workspace or organization.
    :type workspace_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param limit: Results per page. The number of objects to return per page. The value must be between 1 and 100.
    :type limit: int
    :param offset: Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;
    :type offset: str

    :rtype: Union[GetCustomFieldsForWorkspace200Response, Tuple[GetCustomFieldsForWorkspace200Response, int], Tuple[GetCustomFieldsForWorkspace200Response, int, Dict[str, str]]
    """
    return 'do some magic!'


def insert_enum_option_for_custom_field(custom_field_gid, opt_pretty=None, opt_fields=None, insert_enum_option_for_custom_field_request=None):  # noqa: E501
    """Reorder a custom field&#39;s enum

    Moves a particular enum option to be either before or after another specified enum option in the custom field. Locked custom fields can only be reordered by the user who locked the field. # noqa: E501

    :param custom_field_gid: Globally unique identifier for the custom field.
    :type custom_field_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param insert_enum_option_for_custom_field_request: The enum option object to create.
    :type insert_enum_option_for_custom_field_request: dict | bytes

    :rtype: Union[CreateEnumOptionForCustomField201Response, Tuple[CreateEnumOptionForCustomField201Response, int], Tuple[CreateEnumOptionForCustomField201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        insert_enum_option_for_custom_field_request = InsertEnumOptionForCustomFieldRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_custom_field(custom_field_gid, opt_pretty=None, opt_fields=None, create_custom_field_request=None):  # noqa: E501
    """Update a custom field

    A specific, existing custom field can be updated by making a PUT request on the URL for that custom field. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged When using this method, it is best to specify only those fields you wish to change, or else you may overwrite changes made by another user since you last retrieved the custom field. A custom field’s &#x60;type&#x60; cannot be updated. An enum custom field’s &#x60;enum_options&#x60; cannot be updated with this endpoint. Instead see “Work With Enum Options” for information on how to update &#x60;enum_options&#x60;. Locked custom fields can only be updated by the user who locked the field. Returns the complete updated custom field record. # noqa: E501

    :param custom_field_gid: Globally unique identifier for the custom field.
    :type custom_field_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param create_custom_field_request: The custom field object with all updated properties.
    :type create_custom_field_request: dict | bytes

    :rtype: Union[CreateCustomField201Response, Tuple[CreateCustomField201Response, int], Tuple[CreateCustomField201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_custom_field_request = CreateCustomFieldRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_enum_option(enum_option_gid, opt_pretty=None, opt_fields=None, create_enum_option_for_custom_field_request=None):  # noqa: E501
    """Update an enum option

    Updates an existing enum option. Enum custom fields require at least one enabled enum option. Locked custom fields can only be updated by the user who locked the field. Returns the full record of the updated enum option. # noqa: E501

    :param enum_option_gid: Globally unique identifier for the enum option.
    :type enum_option_gid: str
    :param opt_pretty: Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.
    :type opt_pretty: bool
    :param opt_fields: Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.
    :type opt_fields: List[str]
    :param create_enum_option_for_custom_field_request: The enum option object to update
    :type create_enum_option_for_custom_field_request: dict | bytes

    :rtype: Union[CreateEnumOptionForCustomField201Response, Tuple[CreateEnumOptionForCustomField201Response, int], Tuple[CreateEnumOptionForCustomField201Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        create_enum_option_for_custom_field_request = CreateEnumOptionForCustomFieldRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
