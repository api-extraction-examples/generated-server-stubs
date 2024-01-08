import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.operation_message import OperationMessage  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server import util


def addon_properties_resource_delete_addon_property_delete(addon_key, property_key):  # noqa: E501
    """Delete app property

    Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. # noqa: E501

    :param addon_key: The key of the app, as defined in its descriptor.
    :type addon_key: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def addon_properties_resource_get_addon_properties_get(addon_key):  # noqa: E501
    """Get app properties

    Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/). # noqa: E501

    :param addon_key: The key of the app, as defined in its descriptor.
    :type addon_key: str

    :rtype: Union[PropertyKeys, Tuple[PropertyKeys, int], Tuple[PropertyKeys, int, Dict[str, str]]
    """
    return 'do some magic!'


def addon_properties_resource_get_addon_property_get(addon_key, property_key):  # noqa: E501
    """Get app property

    Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/). # noqa: E501

    :param addon_key: The key of the app, as defined in its descriptor.
    :type addon_key: str
    :param property_key: The key of the property.
    :type property_key: str

    :rtype: Union[EntityProperty, Tuple[EntityProperty, int], Tuple[EntityProperty, int, Dict[str, str]]
    """
    return 'do some magic!'


def addon_properties_resource_put_addon_property_put(addon_key, property_key, body):  # noqa: E501
    """Set app property

    Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request. # noqa: E501

    :param addon_key: The key of the app, as defined in its descriptor.
    :type addon_key: str
    :param property_key: The key of the property.
    :type property_key: str
    :param body: 
    :type body: 

    :rtype: Union[OperationMessage, Tuple[OperationMessage, int], Tuple[OperationMessage, int, Dict[str, str]]
    """
    return 'do some magic!'
