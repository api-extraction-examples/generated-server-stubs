import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bulk_custom_field_option_create_request import BulkCustomFieldOptionCreateRequest  # noqa: E501
from openapi_server.models.bulk_custom_field_option_update_request import BulkCustomFieldOptionUpdateRequest  # noqa: E501
from openapi_server.models.custom_field_created_context_options_list import CustomFieldCreatedContextOptionsList  # noqa: E501
from openapi_server.models.custom_field_option import CustomFieldOption  # noqa: E501
from openapi_server.models.custom_field_updated_context_options_list import CustomFieldUpdatedContextOptionsList  # noqa: E501
from openapi_server.models.order_of_custom_field_options import OrderOfCustomFieldOptions  # noqa: E501
from openapi_server.models.page_bean_custom_field_context_option import PageBeanCustomFieldContextOption  # noqa: E501
from openapi_server import util


def create_custom_field_option(field_id, context_id, bulk_custom_field_option_create_request):  # noqa: E501
    """Create custom field options (context)

    Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the custom field.
    :type field_id: str
    :param context_id: The ID of the context.
    :type context_id: int
    :param bulk_custom_field_option_create_request: 
    :type bulk_custom_field_option_create_request: dict | bytes

    :rtype: Union[CustomFieldCreatedContextOptionsList, Tuple[CustomFieldCreatedContextOptionsList, int], Tuple[CustomFieldCreatedContextOptionsList, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bulk_custom_field_option_create_request = BulkCustomFieldOptionCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_custom_field_option(field_id, context_id, option_id):  # noqa: E501
    """Delete custom field options (context)

    Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the custom field.
    :type field_id: str
    :param context_id: The ID of the context from which an option should be deleted.
    :type context_id: int
    :param option_id: The ID of the option to delete.
    :type option_id: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_custom_field_option(id):  # noqa: E501
    """Get custom field option

    Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view. # noqa: E501

    :param id: The ID of the custom field option.
    :type id: str

    :rtype: Union[CustomFieldOption, Tuple[CustomFieldOption, int], Tuple[CustomFieldOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_options_for_context(field_id, context_id, option_id=None, only_options=None, start_at=None, max_results=None):  # noqa: E501
    """Get custom field options (context)

    Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the custom field.
    :type field_id: str
    :param context_id: The ID of the context.
    :type context_id: int
    :param option_id: The ID of the option.
    :type option_id: int
    :param only_options: Whether only options are returned.
    :type only_options: bool
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageBeanCustomFieldContextOption, Tuple[PageBeanCustomFieldContextOption, int], Tuple[PageBeanCustomFieldContextOption, int, Dict[str, str]]
    """
    return 'do some magic!'


def reorder_custom_field_options(field_id, context_id, order_of_custom_field_options):  # noqa: E501
    """Reorder custom field options (context)

    Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the custom field.
    :type field_id: str
    :param context_id: The ID of the context.
    :type context_id: int
    :param order_of_custom_field_options: 
    :type order_of_custom_field_options: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        order_of_custom_field_options = OrderOfCustomFieldOptions.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_custom_field_option(field_id, context_id, bulk_custom_field_option_update_request):  # noqa: E501
    """Update custom field options (context)

    Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#39;t updated and aren&#39;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). # noqa: E501

    :param field_id: The ID of the custom field.
    :type field_id: str
    :param context_id: The ID of the context.
    :type context_id: int
    :param bulk_custom_field_option_update_request: 
    :type bulk_custom_field_option_update_request: dict | bytes

    :rtype: Union[CustomFieldUpdatedContextOptionsList, Tuple[CustomFieldUpdatedContextOptionsList, int], Tuple[CustomFieldUpdatedContextOptionsList, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        bulk_custom_field_option_update_request = BulkCustomFieldOptionUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
