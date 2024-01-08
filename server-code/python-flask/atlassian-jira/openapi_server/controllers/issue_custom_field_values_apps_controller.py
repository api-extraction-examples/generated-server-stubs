import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.custom_field_value_update_details import CustomFieldValueUpdateDetails  # noqa: E501
from openapi_server.models.multiple_custom_field_values_update_details import MultipleCustomFieldValuesUpdateDetails  # noqa: E501
from openapi_server import util


def update_custom_field_value(field_id_or_key, custom_field_value_update_details, generate_changelog=None):  # noqa: E501
    """Update custom field value

    Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation. # noqa: E501

    :param field_id_or_key: The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;.
    :type field_id_or_key: str
    :param custom_field_value_update_details: 
    :type custom_field_value_update_details: dict | bytes
    :param generate_changelog: Whether to generate a changelog for this update.
    :type generate_changelog: bool

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        custom_field_value_update_details = CustomFieldValueUpdateDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_multiple_custom_field_values(multiple_custom_field_values_update_details, generate_changelog=None):  # noqa: E501
    """Update custom fields

    Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation. # noqa: E501

    :param multiple_custom_field_values_update_details: 
    :type multiple_custom_field_values_update_details: dict | bytes
    :param generate_changelog: Whether to generate a changelog for this update.
    :type generate_changelog: bool

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        multiple_custom_field_values_update_details = MultipleCustomFieldValuesUpdateDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
