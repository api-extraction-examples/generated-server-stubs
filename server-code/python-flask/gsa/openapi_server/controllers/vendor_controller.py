import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def get_vendor_get(duns):  # noqa: E501
    """This endpoint returns a single vendor by their 9 digit DUNS number

    &lt;p&gt;This endpoint returns a single vendor by their 9 digit DUNS number. DUNS numbers can be looked up in the &lt;a href&#x3D;\&quot;https://www.sam.gov\&quot;&gt;System for Award Management&lt;/a&gt; by vendor name.&lt;/p&gt; # noqa: E501

    :param duns: a nine digit DUNS number that uniquely identifies the vendor (required)
    :type duns: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
